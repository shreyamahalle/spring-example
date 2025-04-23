// File: com/shreya/spring/repository/BookingRepository.java
package com.shreya.spring.repository;

import com.shreya.spring.model.Booking;

public class BookingRepository {

    public void saveBooking(Booking booking) {
        System.out.println("Booking saved: " + booking);
    }

    public Booking findBookingById(int id) {
        // Dummy data for now
        return Booking.builder()
                .id(id)
                .bookName("Sample Book")
                .price(1000.0)
                .build();
    }
}
