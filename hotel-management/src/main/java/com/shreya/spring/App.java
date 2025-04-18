package com.shreya.spring;

import com.shreya.spring.service.HotelService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {

    public static ApplicationContext context;

    public static void main(String[] args) {
        System.out.println("Hello World!");

        context = new ClassPathXmlApplicationContext("spring.xml");
        HotelService hotelService = context.getBean("hotelService", HotelService.class);

        hotelService.printHotel();
    }
}
