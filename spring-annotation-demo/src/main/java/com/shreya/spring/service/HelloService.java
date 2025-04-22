package com.shreya.spring.service;

import com.shreya.spring.model.Address;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class HelloService {
    private String name;
    private Address address;

    public void sayHello(){
        System.out.println("Hello " + name + " from "+ address.getCity().getName());
    }

}
