package com.example.car.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CarRepository extends JpaRepository<Car, Integer> {
    public List<Car> findByModel(String model);
}
