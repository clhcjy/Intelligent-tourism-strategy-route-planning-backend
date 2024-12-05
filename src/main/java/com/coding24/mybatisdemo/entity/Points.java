package com.coding24.mybatisdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Points {
    private int position_id;
    private String title;
    private String lng;
    private String lat;
    private int pid;
}
