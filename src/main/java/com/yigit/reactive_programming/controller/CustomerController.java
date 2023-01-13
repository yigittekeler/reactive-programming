package com.yigit.reactive_programming.controller;

import com.yigit.reactive_programming.entity.Customer;
import com.yigit.reactive_programming.request.CreateCustomerRequest;
import com.yigit.reactive_programming.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping(value= "/{id}")
    public Mono<Customer> getCustomerById(@PathVariable String id) {

        return customerService.getCustomerById(id);
    }

    @GetMapping(value="/all")
    public Flux<Customer> getCustomers() {

        return customerService.getCustomers();
    }

    @PostMapping(value= "/save")
    public Mono<Customer> createCustomer(@RequestBody CreateCustomerRequest request) {
        return customerService.create(request);
    }
}
