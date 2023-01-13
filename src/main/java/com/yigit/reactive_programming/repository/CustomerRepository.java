package com.yigit.reactive_programming.repository;

import com.yigit.reactive_programming.entity.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends ReactiveMongoRepository<Customer,Long> {

}
