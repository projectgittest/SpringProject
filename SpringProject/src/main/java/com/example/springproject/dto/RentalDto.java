package com.example.springproject.dto;

import com.example.springproject.entities.Customer;
import com.example.springproject.entities.Rental;

import java.sql.Date;

public class RentalDto {
    private int customer;

    private int cars;

    private Date rental_date;

    public int getCustomer() {
        return customer;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    public int getCars() {
        return cars;
    }

    public void setCars(int cars) {
        this.cars = cars;
    }

    public Date getRental_date() {
        return rental_date;
    }

    public void setRental_date(Date rental_date) {
        this.rental_date = rental_date;
    }

    public static RentalDto toDto(Rental rental){
        RentalDto dto=new RentalDto();
        dto.setCars(rental.getCars().getCarId());
        dto.setCustomer(rental.getCustomer().getCustomerId());
        dto.setRental_date(rental.getRental_date());
        return dto;
    }

    public static Rental toEntity(RentalDto rentalDto, com.example.springproject.entities.cars cars, Customer customer){
        Rental entity = new Rental();
        entity.setCars(cars);
        entity.setCustomer(customer);
        entity.setRental_date(rentalDto.getRental_date());

        return entity;
    }
}
