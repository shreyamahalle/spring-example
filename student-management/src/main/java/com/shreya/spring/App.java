package com.shreya.spring;

import com.shreya.spring.service.StudentManagement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static ApplicationContext context;
    public static void main( String[] args )
    {
        context = new ClassPathXmlApplicationContext("spring.xml");
        StudentManagement studentManagement = context.getBean("studentManagement", StudentManagement.class);

        studentManagement.show();
    }
}
