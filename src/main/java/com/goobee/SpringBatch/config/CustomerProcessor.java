package com.goobee.SpringBatch.config;

import org.springframework.batch.item.ItemProcessor;

import com.goobee.SpringBatch.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer>{

	@Override
	public Customer process(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return customer;
	}

}
