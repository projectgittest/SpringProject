package com.example.springproject.entities;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "rental")
public class Rental {
    @Id
    @Column(name = "rental_id")
    private int rental_id;

    @ManyToOne
    @JoinColumn(name="customer_id",nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="car_id",nullable = false)
    private com.example.springproject.entities.cars cars;

    @Column(name = "rental_date")
    private Date rental_date;

    public long getRentalId() {
        return rental_id;
    }

    public void setRentalId(long rentalId) {
        this.rental_id = rental_id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public com.example.springproject.entities.cars getCars() {
        return cars;
    }

    public void setCars(com.example.springproject.entities.cars cars) {
        this.cars = cars;
    }

    public Date getRental_date() {
        return rental_date;
    }

    public void setRental_date(Date rental_date) {
        this.rental_date = rental_date;
    }
}
