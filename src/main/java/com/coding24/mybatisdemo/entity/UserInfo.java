package com.coding24.mybatisdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    private int id;
    private int user_id;
    private String cell_phone_number;
    private String email;
    private String self_introduction;
    private String theme;
    private String Privacy_settings;
    private String language;
    private String Visitor_record;
}
