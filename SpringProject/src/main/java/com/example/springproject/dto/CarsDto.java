package com.example.springproject.dto;

import com.example.springproject.entities.Category;
import com.example.springproject.entities.cars;

import java.sql.Date;

public class CarsDto {

    private String targa;

    private String modello;

    private String category;

    private Date insuranceStart;

    private Date insuranceEnd;

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getInsuranceStart() {
        return insuranceStart;
    }

    public void setInsuranceStart(Date insuranceStart) {
        this.insuranceStart = insuranceStart;
    }

    public Date getInsuranceEnd() {
        return insuranceEnd;
    }

    public void setInsuranceEnd(Date insuranceEnd) {
        this.insuranceEnd = insuranceEnd;
    }

    public static CarsDto toDto(cars cars){
        CarsDto dto = new CarsDto();
        dto.setCategory(cars.getCategory().name());
        dto.setInsuranceEnd(cars.getInsuranceEnd());
        dto.setInsuranceStart(cars.getInsuranceStart());
        dto.setTarga(cars.getTarga());
        dto.setModello(cars.getModello());

        return dto;
    }

    public static cars toEntity(CarsDto carsDto){
        cars entity=new cars();

        entity.setCategory(Category.toEnum(carsDto.getCategory()));
        entity.setInsuranceEnd(carsDto.getInsuranceEnd());
        entity.setInsuranceStart(carsDto.getInsuranceStart());
        entity.setModello(carsDto.getModello());
        entity.setTarga(carsDto.getTarga());

        return entity;
    }
}
