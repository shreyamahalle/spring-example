package com.shreya.spring.service;

import com.shreya.spring.model.Hotel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class HotelService {
    private Hotel hotel;

    public void printHotel() {
        System.out.println("Hotel Details are " + hotel);
    }
}
