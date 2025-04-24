package com.shreya.spring.service;

import com.shreya.spring.model.Collage;
import lombok.Data;

@Data
public class CollageService {

    private Collage collage;

    public void show() {

    }

    public void printdata() {
        System.out.println("collage " + collage);
    }
}
