package com.shreya.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Collage {

    private String collageName;
    private int collageId;
    private String address;

}
