package com.yigit.reactive_programming.service.serviceImpl;

import com.yigit.reactive_programming.entity.Customer;
import com.yigit.reactive_programming.repository.CustomerRepository;
import com.yigit.reactive_programming.request.CreateCustomerRequest;
import com.yigit.reactive_programming.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Mono<Customer> getCustomerById(String id) {
        return customerRepository.findById(id);
    }

    @Override
    public Flux<Customer> getCustomers() {
        return customerRepository.findAll().log();
    }

    @Override
    public Mono<Customer> create(CreateCustomerRequest request) {
        Customer customer = Customer.builder().fullName(request.getFullName()).gsm(request.getGsm()).build();
        return customerRepository.save(customer);
    }

}
