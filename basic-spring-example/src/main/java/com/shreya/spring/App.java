package com.shreya.spring;
import com.shreya.spring.model.Address;
import com.shreya.spring.model.Booking;
import com.shreya.spring.service.BookingService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static ApplicationContext context;
    public static void main(String[] args) throws BeansException {
//        BookingService bookingService = new BookingService();
//        Booking booking =  Booking.builder()
//        .id(101)
//        .price(500.0)
//        .address(
//                Address.builder()
//                        .addressLine1("pune")
//                        .addressLine2("mumbai").city("Aroli").build()
//        ).build();
//
//        bookingService.setBooking(booking);
//
//        bookingService.printBooking();


        context = new ClassPathXmlApplicationContext("spring.xml");
        BookingService bookingService = context.getBean("bookingService" , BookingService.class);

        bookingService.printBooking();
    }
}
