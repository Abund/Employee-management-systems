package com.workspace.employeemanagemetsystems.controller;

import com.workspace.employeemanagemetsystems.dto.response.JwtAuthResponse;
import com.workspace.employeemanagemetsystems.security.JwtTokenProvider;
import com.workspace.employeemanagemetsystems.util.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @GetMapping("/getToken")
    public ResponseEntity<JwtAuthResponse> generateToken(){
        String token = jwtTokenProvider.generateToken();

        JwtAuthResponse response = new JwtAuthResponse();
        response.setMessage(AppConstant.JWT_SUCCESS_MESSAGE);
        response.setToken(token);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
