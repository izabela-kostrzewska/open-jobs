package pl.izakostrzewska.openjobs.security.authorization;


import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import pl.izakostrzewska.openjobs.security.jwt.JwtService;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

public class AuthorizationFilter extends BasicAuthenticationFilter {

    private static final String TOKEN_PREFIX = "Bearer ";

    private final UserDetailsService userDetailsService;
    private final JwtService jwtService;

    public AuthorizationFilter(AuthenticationManager authenticationManager,
                               UserDetailsService userDetailsService,
                               JwtService jwtService) {
        super(authenticationManager);
        this.userDetailsService = userDetailsService;
        this.jwtService = jwtService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws IOException, ServletException {
        getAuthentication(request).ifPresent(this::setAuthenticationContext);
        filterChain.doFilter(request, response);
    }

    private Optional<UsernamePasswordAuthenticationToken> getAuthentication(HttpServletRequest request) {
        return Optional.ofNullable(request.getHeader(HttpHeaders.AUTHORIZATION))
                .filter(token -> token.startsWith(TOKEN_PREFIX))
                .map(token -> token.replace(TOKEN_PREFIX, ""))
                .map(jwtService::extractSubject)
                .map(this::createAuthenticationToken);
    }

    private UsernamePasswordAuthenticationToken createAuthenticationToken(String subject) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(subject);
        return new UsernamePasswordAuthenticationToken(userDetails.getUsername(), null, userDetails.getAuthorities());
    }

    private void setAuthenticationContext(UsernamePasswordAuthenticationToken token) {
        SecurityContextHolder.getContext().setAuthentication(token);
    }
}
