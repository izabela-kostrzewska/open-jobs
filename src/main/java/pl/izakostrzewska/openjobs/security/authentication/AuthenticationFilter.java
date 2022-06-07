package pl.izakostrzewska.openjobs.security.authentication;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import pl.izakostrzewska.openjobs.security.authentication.dto.AuthenticateUserRequestDTO;
import pl.izakostrzewska.openjobs.security.authentication.dto.TokenResponseDTO;
import pl.izakostrzewska.openjobs.security.principal.UserPrincipal;
import pl.izakostrzewska.openjobs.security.jwt.JwtService;

import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RequiredArgsConstructor
public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private final JwtService jwtService;
    private final ObjectMapper objectMapper;

    public AuthenticationFilter(AuthenticationManager authenticationManager,
                                JwtService jwtService,
                                ObjectMapper objectMapper,
                                String url) {
        super(authenticationManager);
        this.jwtService = jwtService;
        this.objectMapper = objectMapper;
        this.setFilterProcessesUrl(url);
    }

    @Override
    @SneakyThrows(IOException.class)
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) {
        AuthenticationToken token = createAuthenticationToken(request);
        setDetails(request, token);
        return getAuthenticationManager().authenticate(token);
    }

    private AuthenticationToken createAuthenticationToken(HttpServletRequest request) throws IOException {
        AuthenticateUserRequestDTO requestDTO = objectMapper.readValue(request.getReader(), AuthenticateUserRequestDTO.class);
        return new AuthenticationToken(requestDTO);
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request,
                                            HttpServletResponse response,
                                            FilterChain chain,
                                            Authentication authentication) throws IOException {
        UserPrincipal principal = (UserPrincipal) authentication.getPrincipal();
        String token = jwtService.createToken(principal);

        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.getWriter().write(objectMapper.writeValueAsString(new TokenResponseDTO(token)));
    }
}
