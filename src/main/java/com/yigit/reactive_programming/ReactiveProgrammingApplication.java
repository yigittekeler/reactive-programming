package com.yigit.reactive_programming;

import com.yigit.reactive_programming.entity.Customer;
import com.yigit.reactive_programming.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootApplication
public class ReactiveProgrammingApplication {

//    @Autowired
//    private CustomerRepository customerRepository;

    public static void main(String[] args) {
        SpringApplication.run(ReactiveProgrammingApplication.class, args);
    }

//    @EventListener(ApplicationStartedEvent.class)
//    public void appStart() {
//        if (customerRepository.count().block() == 0) {
//            IntStream.range(0, 100)
//                    .mapToObj(this::generate)
//                    .map(customerRepository::save)
//                    .collect(Collectors.toList())
//                    .forEach(item -> item.subscribe(System.out::println));
//        }
//    }
//
//    private Customer generate(int i) {
//        return Customer.builder()
//                .fullName("n"+i)
//                .gsm("gsm"+i)
//                .build();
//    }

}
