package com.shreya.spring.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Booking {
    private int id;
    private double price;
    private Address address;

}
