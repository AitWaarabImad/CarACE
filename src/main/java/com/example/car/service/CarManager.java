package com.example.car.service;

import com.example.car.dao.Car;
import com.example.car.dao.CarRepository;
import com.example.car.dto.CarDTO;
import com.example.car.mapper.CarMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarManager implements CarService {

    @Autowired
    private CarRepository carRepository;
    @Autowired
    private CarMapper carMapper;


    @Override
    public CarDTO saveCar(CarDTO car) {
        Car car1 = carMapper.ConvertDtoToCarEntity(car);
        car1 = carRepository.save(car1);
        return carMapper.ConvertCarEntityToDto(car1);
    }

    @Override
    public List<CarDTO> getCarByModel(String model) {
        List<Car> cars = carRepository.findByModel(model);
        List<CarDTO> carDTOS = new ArrayList<>();
        for (Car car : cars) {
            carDTOS.add(carMapper.ConvertCarEntityToDto(car));
        }
        return carDTOS;
    }
}
