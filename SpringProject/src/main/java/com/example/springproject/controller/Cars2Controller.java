package com.example.springproject.controller;

import com.example.springproject.dto.CarsDto;
import com.example.springproject.entities.Category;
import com.example.springproject.entities.cars;
import com.example.springproject.service.Cars2Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class Cars2Controller {

    private final Cars2Service cars2Service;


    public Cars2Controller(Cars2Service cars2Service) {
        this.cars2Service = cars2Service;
    }

    @GetMapping("/cars/Rental_date")
    public ResponseEntity<List<cars>> getByRental_date(@RequestParam int year, @RequestParam int month ){
        return ResponseEntity.ok(cars2Service.findAllRental(year, month));
    }


    @PostMapping("create")
    public ResponseEntity<CarsDto>addItem(@RequestBody CarsDto carsDto){
        return ResponseEntity.ok(cars2Service.save(carsDto));
    }

    @GetMapping("allinsurancepolicies")
    public ResponseEntity<List<cars>> findAll(){
        return ResponseEntity.ok(cars2Service.findAllByInsuranceEnd());
    }

    @GetMapping("/cars/allcars")
    public  ResponseEntity<List<cars>>getbyCategory(@RequestParam Category category){
        return ResponseEntity.ok(cars2Service.findAllByCategory(category));
    }

}
