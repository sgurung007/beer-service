package com.gurung.beerservice.web.mapper;

import com.gurung.beerservice.domain.Customer;
import com.gurung.beerservice.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto customerDto);

}
