package com.coding24.mybatisdemo.service;

import com.coding24.mybatisdemo.entity.Records;

import java.time.LocalDateTime;

public interface RecordService {
    public void insertRecord(int uid);
    public void deleteRecord(int id);
    public void updateRecord(int uid);
    public Records findRecordById(int id);
    public Records[] findAllRecord();
    public Records[] findRecordByUid(int uid);
    public Records[] findRecordByTime(String time);
}
