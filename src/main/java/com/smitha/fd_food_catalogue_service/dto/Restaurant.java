package com.smitha.fd_food_catalogue_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    private int id;
    private String name;
    private String address;
    private String city;
    private String restaurantDescription;
}
