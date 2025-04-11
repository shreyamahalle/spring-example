package com.shreya.spring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Setter;

@Data
@Builder
@Setter

public class Address {
    private City city;
    public Address(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }
}