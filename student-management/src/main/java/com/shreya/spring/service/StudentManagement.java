package com.shreya.spring.service;

import com.shreya.spring.model.Student;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class StudentManagement {
    private Student student;

    public void show(){
        System.out.println("Student details " + student);
    }

}
