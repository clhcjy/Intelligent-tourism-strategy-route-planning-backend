package com.coding24.mybatisdemo.service.impl;

import com.coding24.mybatisdemo.mapper.RecordMapper;
import com.coding24.mybatisdemo.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding24.mybatisdemo.entity.Records;

@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordMapper recordMapper;

    /**
     * @param uid
     */
    @Override
    public void insertRecord(int uid) {
        recordMapper.insert(uid);
    }

    /**
     * @param id
     */
    @Override
    public void deleteRecord(int id) {
        recordMapper.deleteById(id);
    }

    /**
     * @param uid
     */
    @Override
    public void updateRecord(int uid) {
        recordMapper.update(uid);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Records findRecordById(int id) {
        return recordMapper.findById(id);
    }

    /**
     * @return
     */
    @Override
    public Records[] findAllRecord() {
        return recordMapper.findAll();
    }

    /**
     * @param uid
     * @return
     */
    @Override
    public Records[] findRecordByUid(int uid) {
        return recordMapper.findByUid(uid);
    }

    /**
     * @param time
     * @return
     */
    @Override
    public Records[] findRecordByTime(String time) {
        return recordMapper.findByTime(time);
    }
}
