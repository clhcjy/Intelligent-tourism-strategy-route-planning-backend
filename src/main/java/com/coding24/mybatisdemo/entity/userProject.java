package com.coding24.mybatisdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class userProject {
    private int pid;
    private String projectName;
    private int uid;
    private String picture;
    private String category;
}
