package com.dataarchiveunit.domain.account;

import org.springframework.beans.factory.annotation.Value;

public class TokenProvider {
    private final String SECRET;
    private final String TOKEN_PREFIX = "Bearer ";
    public TokenProvider(@Value("${jwt.secret}") String secret) {
        this.SECRET = secret;
    }
}
