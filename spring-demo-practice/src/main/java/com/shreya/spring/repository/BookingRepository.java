package com.shreya.spring.repository;

import com.shreya.spring.model.Booking;

public class BookingRepository {

    public void saveBooking(Booking booking) {
        System.out.println("Booking saved: " + booking);
    }

    public void findBookingById(int id) {
        // Dummy data for now
        Booking.builder()
                .id(id)
                .bookName("Sample Book")
                .price(1000.0)
                .build();
    }
}
