package pl.izakostrzewska.openjobs.security.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.izakostrzewska.openjobs.security.principal.UserPrincipal;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class JwtService {

    private final JwtProperties properties;

    public String createToken(UserPrincipal principal) {
        return JWT.create()
                .withSubject(principal.getUsername())
                .withExpiresAt(new Date(System.currentTimeMillis() + properties.getExpiresIn()))
                .sign(Algorithm.HMAC256(properties.getSecret()));
    }

    public String extractSubject(String token) {
        return JWT.require(Algorithm.HMAC256(properties.getSecret()))
                .build()
                .verify(token)
                .getSubject();
    }
}
