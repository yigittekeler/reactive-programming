package com.yigit.reactive_programming.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCustomerRequest {

    private String fullName;
    private String gsm;
}
