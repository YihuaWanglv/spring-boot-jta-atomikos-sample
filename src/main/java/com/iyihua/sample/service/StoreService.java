package com.iyihua.sample.service;

import com.iyihua.sample.domain.customer.Customer;
import com.iyihua.sample.domain.order.Order;
import com.iyihua.sample.exception.NoRollbackException;
import com.iyihua.sample.exception.StoreException;

public interface StoreService {
	
	void store(Customer customer, Order order) throws Exception;
	
	void storeWithStoreException(Customer customer, Order order) throws StoreException;
	
	void storeWithNoRollbackException(Customer customer, Order order) throws NoRollbackException;
	
	void transferWithStoreException() throws StoreException;
	void transferWithNoRollbackException() throws NoRollbackException;
	void transfer();

}
