package com.shreya.spring.model;

import lombok.*;

@Data
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int empId;
    private String empName;
}
