package br.com.containerandvirtualization.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping()
    public ResponseEntity<String> get(String id) {
        return ResponseEntity.ok("Giovana");

    }

}
