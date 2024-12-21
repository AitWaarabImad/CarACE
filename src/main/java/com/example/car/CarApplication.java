package com.example.car;

import com.example.car.dto.CarDTO;
import com.example.car.service.CarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CarApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CarService carService) {
        return args -> {
            carService.saveCar(CarDTO.builder().model("BMW").color("red").matricul("Blue").price(120005F).build());
            carService.saveCar(CarDTO.builder().model("BMW").matricul("ef6e+6").color("Red").price(6540089F).build());
            carService.saveCar(CarDTO.builder().model("Audi").matricul("ef64we8").color("yellow").price(890000F).build());
            carService.saveCar(CarDTO.builder().model("Mercedes").matricul("wrdqwqw").color("White").price(645000F).build());

        };
    }
}
