package com.shreya.spring.model;

import lombok.*;

@Data
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    private int id;
    private double price;
    private Hotel hotel;
}
