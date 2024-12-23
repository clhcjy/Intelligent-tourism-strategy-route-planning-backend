package com.coding24.mybatisdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OtherPoints {
    private int OtherPoints_id;
    private String point_address;
    private String title;
    private String lng;
    private String lat;
    private String address;
    private String province;
    private String city;
    private String tags;
    private String category;
}
