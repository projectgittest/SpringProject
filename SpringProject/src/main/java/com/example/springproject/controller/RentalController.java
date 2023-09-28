package com.example.springproject.controller;


import com.example.springproject.Exceptions.UserNotFound;
import com.example.springproject.dto.RentalDto;
import com.example.springproject.entities.Rental;
import com.example.springproject.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
public class RentalController {
    @Autowired
    private  RentalService rentalService;


    @PostMapping("save-rental")
    public ResponseEntity<Rental> addItem(@RequestBody RentalDto rentalDto){
        return ResponseEntity.ok(rentalService.save(rentalDto));

    }

}
