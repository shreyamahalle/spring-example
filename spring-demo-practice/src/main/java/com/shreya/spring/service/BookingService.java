package com.shreya.spring.service;

import com.shreya.spring.model.Booking;
import com.shreya.spring.repository.BookingRepository;
import lombok.Data;

@Data
public class BookingService {

   private BookingRepository bookingRepository;
   private Booking booking;

   public void createBooking(){
      bookingRepository.saveBooking(booking);

   }
   public void printBooking(){
      System.out.println("Booking details " + booking);
   }

}
