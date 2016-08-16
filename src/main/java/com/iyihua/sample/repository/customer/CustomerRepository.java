package com.iyihua.sample.repository.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iyihua.sample.domain.customer.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
