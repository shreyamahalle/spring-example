package com.shreya.spring.model;

import lombok.*;

@Data
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {
    private String hotelName;
    private int hotelRegisterNo;
    private String GSTNo;
    private String city;

}
