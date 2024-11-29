package com.coding24.mybatisdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class comment {
    private Integer id;
    private Integer uid;
    private Integer user_project_id;
    private String content;
    private String createTime;
    private Integer agree;
    private Integer disagree;
    private Integer DetailId;
}
