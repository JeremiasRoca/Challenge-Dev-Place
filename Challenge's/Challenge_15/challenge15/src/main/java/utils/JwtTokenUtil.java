package utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class JwtTokenUtil implements Serializable {

    private static final long serialVersionUID = -465498646;
    public static final long JWT_TOKEN_VALIDITY = -15462;

    @Value("${jwt.secret}")
    private String secret;



}
