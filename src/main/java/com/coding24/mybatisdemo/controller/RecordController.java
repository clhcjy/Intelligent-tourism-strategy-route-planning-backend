package com.coding24.mybatisdemo.controller;

import com.coding24.mybatisdemo.entity.Records;
import com.coding24.mybatisdemo.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;

@RestController
@RequestMapping("/record")
public class RecordController {
    @Autowired
    private RecordService recordService;

    @PostMapping("/selectById")
    public Records selectRecordById(@RequestParam int id){
        return recordService.findRecordById(id);
    }

    @PostMapping("/selectByUid")
    public Records[] selectRecordByUid(@RequestParam int uid){
        return recordService.findRecordByUid(uid);
    }

    @PostMapping("/selectByTime")
    public Records[] selectRecordByTime(@RequestParam String time){
        return recordService.findRecordByTime(time);
    }

    @PostMapping("/insert")
    public void insertRecord(@RequestParam int uid){
        recordService.insertRecord(uid);
    }

    @PostMapping("/update")
    public void updateRecord(@RequestParam int uid){
        recordService.updateRecord(uid);
    }

    @PostMapping("/delete")
    public void deleteRecord(@RequestParam int uid){
        recordService.deleteRecord(uid);
    }

    @GetMapping("/findAll")
    public Records[] findAllRecord(){
        Records[] records = recordService.findAllRecord();
        System.out.println("数据" + Arrays.toString(records));

        return records;
    }
}
