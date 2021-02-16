package com.gurung.beerservice.web.controller;

import com.gurung.beerservice.web.model.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable UUID customerId){
        return  new ResponseEntity<>(CustomerDto.builder().id(customerId)
        .name("sam").build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewCustomer(@Valid @RequestBody CustomerDto customerDto){
//        TODO:
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{CusotmerId")
    public ResponseEntity updateCustonerById(@PathVariable UUID customerId,
                                             @RequestBody CustomerDto customerDto ){
//        TODO:
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }



}
