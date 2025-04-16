package com.goobee.SpringBatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goobee.SpringBatch.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
