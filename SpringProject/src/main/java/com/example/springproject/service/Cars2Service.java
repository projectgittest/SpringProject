package com.example.springproject.service;

import com.example.springproject.dto.CarsDto;
import com.example.springproject.entities.Category;
import com.example.springproject.entities.cars;
import com.example.springproject.repositories.Cars2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Cars2Service {
    @Autowired
    Cars2Repository cars2Repository;

    public Cars2Service (Cars2Repository cars2Repository) {
        this.cars2Repository=cars2Repository;
    }


//     cars = new ArrayList<>();
    public List<cars> findAllRental(int year, int month){
        List<cars> cars = cars2Repository.findAllRental(year,month);
        return cars;
    }

    public CarsDto save(CarsDto dto){
        cars carsDto=cars2Repository.save(CarsDto.toEntity(dto));

        return CarsDto.toDto(carsDto);
    }

    List<cars> insurancepolicies = new ArrayList<>();
    public List<cars>findAllByInsuranceEnd(){
        insurancepolicies= cars2Repository.findAllByInsuranceEnd();
        return insurancepolicies;
    }

    List<cars>cars2=new ArrayList<>();
    public List<cars>findAllByCategory(Category category){
        cars2 =cars2Repository.findAllByCategory(category);
        return cars2;
    }

}
