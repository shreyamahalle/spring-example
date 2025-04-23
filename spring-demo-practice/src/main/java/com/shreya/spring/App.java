package com.shreya.spring;

import com.shreya.spring.controller.BookingController;
import com.shreya.spring.repository.BookingRepository;
import com.shreya.spring.service.BookingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    static ApplicationContext context;
    public static void main( String[] args )
    {
     context = new ClassPathXmlApplicationContext("spring.xml");
     BookingService bookingService = context.getBean("bookingService" , BookingService.class);
     bookingService.printBooking();

     BookingController bookingController = context.getBean("bookingController" , BookingController.class);
     bookingController.displayBooking();
     bookingController.createBooking();

     BookingRepository bookingRepository = context.getBean("bookingRepository",BookingRepository.class);
     bookingRepository.findBookingById(101);
    }
}
