package com.coding24.mybatisdemo.service.impl;

import com.coding24.mybatisdemo.entity.OtherPoints;
import com.coding24.mybatisdemo.mapper.OtherPointsMapper;
import com.coding24.mybatisdemo.service.OtherPointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OtherPointsServiceImpl implements OtherPointsService {

    @Autowired
    OtherPointsMapper otherPointsMapper;

    /**
     * @param OtherPoints_id
     */
    @Override
    public void deleteOtherPoints(int OtherPoints_id) {
        otherPointsMapper.deleteOtherPoints(OtherPoints_id);
    }

    /**
     * @param OtherPoints
     */
    @Override
    public void insertOtherPoints(OtherPoints OtherPoints) {
        otherPointsMapper.insertOtherPoints(OtherPoints);
    }

    /**
     * @param point_address
     * @return
     */
    @Override
    public OtherPoints[] findByPoint_address(String point_address,String category) {
        return otherPointsMapper.findByPoint_address(point_address,category);
    }

    /**
     * @param OtherPoints_id
     * @return
     */
    @Override
    public OtherPoints findByOtherPoints_id(int OtherPoints_id) {
        return otherPointsMapper.findByOtherPoints_id(OtherPoints_id);
    }

    /**
     * @return
     */
    @Override
    public OtherPoints[] findAll() {
        return otherPointsMapper.findAll();
    }

    /**
     * @param OtherPoints
     */
    @Override
    public void updateOtherPoints(OtherPoints OtherPoints) {
        otherPointsMapper.updateOtherPoints(OtherPoints);
    }
}
