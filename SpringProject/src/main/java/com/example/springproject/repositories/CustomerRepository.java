package com.example.springproject.repositories;

import com.example.springproject.entities.Category;
import com.example.springproject.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer,Integer> {

    @Query("select c from Customer c join Rental r on c.customer_id=r.customer.customer_id join cars cc on r.cars.car_id=cc.car_id where cc.category =?1")
     List<Customer>getCustomer(@Param("category") Category category);

    @Query("select c from Customer c where c.customer_id =?1 ")
    Customer findByCustomer_id(int id);

}

