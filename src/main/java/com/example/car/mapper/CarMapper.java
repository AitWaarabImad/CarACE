package com.example.car.mapper;

import com.example.car.dao.Car;
import com.example.car.dto.CarDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    public Car ConvertDtoToCarEntity(CarDTO carDTO) {
        return modelMapper.map(carDTO, Car.class);
    }

    public CarDTO ConvertCarEntityToDto(Car car) {
        return modelMapper.map(car, CarDTO.class);
    }
}
