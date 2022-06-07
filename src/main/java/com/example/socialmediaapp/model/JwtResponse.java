package com.example.socialmediaapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class JwtResponse {


    private static final long serialVersionUID = 1L;
    private final String token;

    public JwtResponse(String token) {
        this.token = token;
    }
}
