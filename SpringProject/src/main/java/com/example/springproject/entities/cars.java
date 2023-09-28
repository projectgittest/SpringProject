package com.example.springproject.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "cars")
public class cars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int car_id;

    @Column(name = "Targa")
    private String targa;

    @Column(name = "Modello")
    private String modello;

    @Column(name = "Category")
    private Category category;

    @Column(name = "insurance_start")
    private Date insuranceStart;

    @Column(name = "insurance_end")
    private Date insuranceEnd;

    /*@OneToMany(mappedBy = "cars")
    private Set<Rental> rental_id;*/

    public int getCarId() {
        return car_id;
    }

    public void setCarId(int carId) {
        this.car_id=car_id;
    }

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
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

    /*public Set<Rental> getRental_id() {
        return rental_id;
    }

    public void setRental_id(Set<Rental> rental_id) {
        this.rental_id=rental_id;
    }*/
}


