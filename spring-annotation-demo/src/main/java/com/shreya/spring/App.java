package com.shreya.spring;

import com.shreya.spring.model.Address;
import com.shreya.spring.model.City;
import com.shreya.spring.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.shreya.spring")

public class App {
    public static ApplicationContext context;
    public static void main( String[] args ) {

        City city = City.builder().name("pune").build();

        Address address = Address.builder().city(city).build();

        context = new AnnotationConfigApplicationContext(App.class);
        HelloService helloService = context.getBean("helloService" , HelloService.class);
        helloService.setName("shreya");
        helloService.setAddress(address);

        helloService.sayHello();

    }
}
