package com.projects.login_auth_api.controllers;

import com.projects.login_auth_api.domain.user.User;
import com.projects.login_auth_api.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {


    private final UserRepository repository;

    @GetMapping
    public ResponseEntity<String> getUser() {
        return ResponseEntity.ok("sucesso!");
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUser() {
        List<User> users = repository.findAll();
        return ResponseEntity.ok(users);
    }
}
