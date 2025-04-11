package com.coding24.mybatisdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class resources {
    private Integer id;
    private String title;
    private String content;
    private String link;
    private String classification;
    private Integer status;
}
