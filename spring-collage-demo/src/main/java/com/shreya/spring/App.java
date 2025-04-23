package com.shreya.spring;

import com.shreya.spring.service.CollageService;
import com.shreya.spring.service.LibraryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    static ApplicationContext context;
    public static void main( String[] args )
    {
      context = new ClassPathXmlApplicationContext("spring.xml");
      CollageService collageService = context.getBean("collageService" , CollageService.class);
      collageService.printdata();

      LibraryService libraryService = context.getBean("libraryService" , LibraryService.class);
      libraryService.showLibrary();
    }
}
