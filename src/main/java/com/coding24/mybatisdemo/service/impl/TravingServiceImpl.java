package com.coding24.mybatisdemo.service.impl;

import com.coding24.mybatisdemo.entity.Traving;
import com.coding24.mybatisdemo.mapper.TravingMapper;
import com.coding24.mybatisdemo.service.TravingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TravingServiceImpl implements TravingService {
    @Autowired
    private TravingMapper travingMapper;
    /**
     * @param tid
     */
    @Override
    public void deleteTraving(int tid) {
        travingMapper.deleteTraving(tid);
    }

    /**
     * @param traving
     */
    @Override
    public void insertTraving(Traving traving) {
        travingMapper.insertTraving(traving);
    }

    /**
     * @param tid
     * @return
     */
    @Override
    public Traving selectTraving(int tid) {
        return travingMapper.selectTraving(tid);
    }

    /**
     * @param uid
     * @return
     */
    @Override
    public Traving selectTravingByUid(int uid) {
        return travingMapper.selectTravingByUid(uid);
    }

    /**
     * @param traving
     */
    @Override
    public void updateTraving(Traving traving) {
        travingMapper.updateTraving(traving);
    }
}
