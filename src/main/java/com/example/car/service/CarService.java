package com.example.car.service;

import com.example.car.dto.CarDTO;

import java.util.List;

public interface CarService {

    public CarDTO saveCar(CarDTO car);
    public List<CarDTO> getCarByModel(String model);
}
