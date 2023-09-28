package com.example.springproject.service;

import com.example.springproject.entities.Category;
import com.example.springproject.entities.Customer;
import com.example.springproject.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

   @Autowired
    CustomerRepository customerRepository;

    public  CustomerService(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }

    public CustomerService(){

    }
    List<Customer> customers = new ArrayList<>();
    public List<Customer>getCustomers(Category category){
        customers=customerRepository.getCustomer(category);
        return customers;
    }
    public Customer findByCustomer_id(int id){
        return customerRepository.findByCustomer_id(id);
    }

}
