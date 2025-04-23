package com.shreya.spring.controller;

import com.shreya.spring.service.BookingService;
import lombok.Data;

@Data
public class BookingController {

    private BookingService bookingService;

    public void createBooking() {
        System.out.println("Controller: createBooking()");
        bookingService.createBooking();
    }

    public void displayBooking() {
        System.out.println("Controller: displayBooking()");
        bookingService.printBooking();
    }
}
