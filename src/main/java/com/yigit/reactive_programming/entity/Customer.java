package com.yigit.reactive_programming.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@Builder
public class Customer {

    @Id
    private String id;
    private String fullName;
    private String gsm;
}
