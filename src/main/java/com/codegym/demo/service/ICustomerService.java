package com.codegym.demo.service;

import com.codegym.demo.model.Customer;

import java.util.List;

public interface ICustomerService {
    public List<Customer> findAll();
    public Customer findById(int id);
    public void save(Customer customer);
    public void remove(int id);
}
