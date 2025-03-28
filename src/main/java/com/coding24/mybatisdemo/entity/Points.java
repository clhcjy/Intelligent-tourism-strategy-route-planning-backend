package com.coding24.mybatisdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Points {
    private int position_id;
    private String title;
    private String lng;
    private String lat;
    private int pid;
    private String address;
    private String province;
    private String city;
    private String tags;
}
