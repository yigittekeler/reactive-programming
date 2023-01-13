package com.yigit.reactive_programming.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {

    public ResponseEntity<Integer> getUserById(Long id) {

        return ResponseEntity.ok(2);
    }
}
