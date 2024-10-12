package org.example.course.controller;

import org.example.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/findAll")
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Ricardo Roque", "ricardo@gmail.com", "999999999", "123456");
        return ResponseEntity.ok().body(user);
    }
}
