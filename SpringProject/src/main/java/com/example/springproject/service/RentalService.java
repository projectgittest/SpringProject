package com.example.springproject.service;

import com.example.springproject.Exceptions.UserNotFound;
import com.example.springproject.dto.RentalDto;
import com.example.springproject.entities.Customer;
import com.example.springproject.entities.Rental;
import com.example.springproject.entities.cars;
import com.example.springproject.repositories.Cars2Repository;
import com.example.springproject.repositories.CustomerRepository;
import com.example.springproject.repositories.RentalRepository;
import org.springframework.stereotype.Service;

@Service
public class RentalService {
    private final Cars2Repository cars2Repository;
    private final CustomerRepository customerRepository;
    private final RentalRepository rentalRepository;

    public RentalService(Cars2Repository cars2Repository, CustomerRepository customerRepository, RentalRepository rentalRepository) {
        this.cars2Repository = cars2Repository;
        this.customerRepository = customerRepository;
        this.rentalRepository = rentalRepository;
    }

    public Rental save(RentalDto dto) {

        if (dto != null && dto.getCars() != 0 && dto.getCars() <= 11) {
            cars carsEntity = cars2Repository.findByCar_id(dto.getCars());
            if (dto.getCustomer() != 0 && dto.getCustomer() <= 8) {
                Customer customerEntity = customerRepository.findByCustomer_id(dto.getCustomer());
                Rental rental = RentalDto.toEntity(dto, carsEntity, customerEntity);
                return rentalRepository.save(rental);

            }
        }
        throw new UserNotFound();

    }
}
