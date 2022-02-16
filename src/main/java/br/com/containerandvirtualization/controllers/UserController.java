package br.com.containerandvirtualization.controllers;

import br.com.containerandvirtualization.entities.User;
import br.com.containerandvirtualization.repositories.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping()
    public ResponseEntity<List<User>> get() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @PostMapping()
    public ResponseEntity<User> create(@RequestBody User user) {
        return ResponseEntity.ok(userRepository.insert(user));
    }

}
