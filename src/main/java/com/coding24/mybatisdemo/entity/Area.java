package com.coding24.mybatisdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Area {
    private int aid;
    private String Province;
    private String City;
    private String District;
    private String Street;
    private String Address;
}
