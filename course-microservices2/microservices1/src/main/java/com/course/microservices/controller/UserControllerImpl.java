package com.course.microservices.controller;

import com.course.microservices.model.User;
import com.course.microservices.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserControllerImpl implements UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/{id}")
    public ResponseEntity<User> findyId(@PathVariable Long id) {
        return ResponseEntity.ok(userService.findyById(id));
    }

    @PostMapping("/")
    public ResponseEntity<List<String>> findyIdIn(@RequestBody List<Long> ids) {
        return ResponseEntity.ok(userService.findyByIdIn(ids));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(Principal principal) {
        return ResponseEntity.ok(userService.loadUserByUsername(principal.getName()));
    }
}
