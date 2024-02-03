package com.TpHost.AppSecurity.infra.security;


import com.TpHost.AppSecurity.model.Users;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenService {

    @Value("${api.security.token.secret}")
    private String secret;

    // metodo para gerar o token
    public String generateToken(Users users) {
        System.out.println(users);

        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            String token = JWT.create()
                    .withIssuer("auth-api")
                    .withSubject(users.getLogin())
                    .withExpiresAt(generateExperitionDate())
                    .sign(algorithm);

            System.out.println(token);
            return token;


        } catch (JWTCreationException exception) {
            throw new RuntimeException("error while generate token ", exception);
        }

    }

    // metodo para expiração
    private Instant generateExperitionDate() {
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));   // 2 siginica o tempo de duração de expiration
    }

    //    metodo para validação do token
    public String validateToken(String token) {
        System.out.println(token);

        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            return JWT.require(algorithm)
                    .withIssuer("auth-api")
                    .build()
                    .verify(token)
                    .getSubject();

        } catch (JWTVerificationException exception) {
            System.err.println("Error validating token: " + exception.getMessage());

            return "";   // caso o token é invalido.

        }


    }


}
