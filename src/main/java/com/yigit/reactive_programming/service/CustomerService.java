package com.yigit.reactive_programming.service;

import com.yigit.reactive_programming.entity.Customer;
import com.yigit.reactive_programming.request.CreateCustomerRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService {

    Mono<Customer> getCustomerById(String id);

    Flux<Customer> getCustomers();

    Mono<Customer> create(CreateCustomerRequest request);
}
