package com.shreya.spring.service;

import com.shreya.spring.model.Booking;
import com.shreya.spring.repository.BookingRepositroy;
import lombok.Data;

@Data
public class BookingService {

   private BookingRepositroy bookingRepositroy;
   private Booking booking;

   public void createBopking(){

   }
   public void printBooking(){
      System.out.println("Booking details " + booking);
   }

}
