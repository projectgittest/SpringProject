package com.example.springproject.repositories;

import com.example.springproject.entities.Category;
import com.example.springproject.entities.cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Cars2Repository  extends JpaRepository<cars,Integer> {

    /*@Query("select c from cars2 c where c.rented_date between ?1 and ?2")
    List<cars2> findByRented_dateBetween(Date startDate,Date endDate);*/

   /* @Query("select c from Car c where year(c.rented_date) = :year and month(c.rented_date) = :month")
    List<Car> findAllByRented_date(@Param("year") Integer year, @Param("month") Integer month);

    @Query("select c from Car c where c.Marche=?1 ")
    List<Car>findAllByMarche(@Param("Marche") String Marche);
    */


    @Query(nativeQuery = true,
            value = "select * from cars c join rental r on c.car_id=r.car_id where year(r.rental_date) = ?1 and month(r.rental_date) = ?2")
    List<cars> findAllRental(@Param("year") int year, @Param("month") int month);

    @Query("select c from cars c where c.car_id=?1 ")
    cars findByCar_id(int id);

    @Query("select c FROM cars c where c.insuranceEnd<CURRENT_DATE ")
    List<cars>findAllByInsuranceEnd();


    @Query("select c from cars c where c.category=?1 ")
    List<cars>findAllByCategory(@Param("category") Category category);

}
