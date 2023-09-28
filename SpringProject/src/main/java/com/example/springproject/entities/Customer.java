package com.example.springproject.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_id;

    private String nome;

    private String cognome;


    /*@OneToMany(mappedBy = "customer")
    private Set<Rental> rentalId;*/

    public int getCustomerId() {
        return customer_id;
    }

    public void setCustomerId(int customerId) {
        this.customer_id = customerId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

   /* public Set<Rental> getRental_id() {
        return rentalId;
    }

    public void setRental_id(Set<Rental> rental_id) {
        this.rentalId = rentalId;
    }*/
}



