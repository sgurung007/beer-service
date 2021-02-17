package com.gurung.beerservice.repositories;

import com.gurung.beerservice.domain.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, UUID> {
}
