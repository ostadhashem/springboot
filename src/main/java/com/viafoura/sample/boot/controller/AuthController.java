package com.viafoura.sample.boot.controller;

import com.viafoura.sample.boot.domain.Address;
import com.viafoura.sample.boot.message.AddressMessage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.CookieGenerator;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.net.URI;

/**
 * Created by sina on 2016-09-27.
 */
@RestController
public class AuthController {

    @PostMapping("/auth")
    public void auth(@RequestHeader String username, HttpServletResponse response) {
        Cookie cookie = new Cookie("name", username);
        cookie.setMaxAge(60*60);
        response.addCookie(cookie);
    }

    @GetMapping("/user")
    public String user(@CookieValue String name){
        return name;
    }
}
