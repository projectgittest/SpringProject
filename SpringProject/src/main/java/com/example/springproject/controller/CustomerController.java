package com.example.springproject.controller;

import com.example.springproject.Exceptions.CustomerNotFound;
import com.example.springproject.entities.Category;
import com.example.springproject.entities.Customer;
import com.example.springproject.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class CustomerController {
     public final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/Customer/allcustomers")
    public  ResponseEntity<List<Customer>>getCustomers(@RequestParam Category category) {
        return ResponseEntity.ok(customerService.getCustomers(category));
    }


    @GetMapping("/Customer/{id}")
    public ResponseEntity<Customer> findByCustomer_id(@PathVariable int id){
        Customer c = customerService.findByCustomer_id(id);
        try {
            if(c==null)
                throw new CustomerNotFound();
        }
        catch (CustomerNotFound customerNotFound){
            System.out.println("Customer Id is not valid");
        }

        return  ResponseEntity.ok(c);
    }


}
