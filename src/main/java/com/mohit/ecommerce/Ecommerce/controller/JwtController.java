package com.mohit.ecommerce.Ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mohit.ecommerce.Ecommerce.entity.JwtRequest;
import com.mohit.ecommerce.Ecommerce.entity.JwtResponse;
import com.mohit.ecommerce.Ecommerce.service.JwtService;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin
public class JwtController {
	@Autowired
    private JwtService jwtService;

    @PostMapping({"/authenticate"})
    public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest) throws Exception {
        return jwtService.createJwtToken(jwtRequest);
    }
}
