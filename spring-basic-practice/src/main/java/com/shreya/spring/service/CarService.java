package com.shreya.spring.service;

import com.shreya.spring.model.Car;
import lombok.Data;

@Data
public class CarService {

    private Car car;

    public void printCarInfo(){
        System.out.println("Car Info " + car);
    }
}
