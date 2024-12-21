package com.example.car.web;


import com.example.car.dto.CarDTO;
import com.example.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CarGraphQLController {

    @Autowired
    private CarService carService;

    @QueryMapping
    public List<CarDTO> getCarByModel(@Argument String model) {
        return carService.getCarByModel(model);
    }

    @MutationMapping
    public CarDTO saveCar(@Argument CarDTO car) {
        return carService.saveCar(car);
    }
}
