package com.shreya.spring;

import com.shreya.spring.service.CarService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    static ApplicationContext context;
    public static void main( String[] args )
    {

    context = new ClassPathXmlApplicationContext("spring.xml");
    CarService carService =  context.getBean("carService" , CarService.class);
    carService.printCarInfo();
    }
}
