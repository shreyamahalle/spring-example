package com.shreya.spring.service;

import com.shreya.spring.model.Booking;
import lombok.Data;

@Data
public class BookingService {

    private Booking booking;

    //ask to spring
    public void createBooking(){

    }
    public void printBooking(){
        System.out.println("Booking Detalis are: " + booking);
    }

}
