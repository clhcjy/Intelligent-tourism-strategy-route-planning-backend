package com.coding24.mybatisdemo.service.impl;

import com.coding24.mybatisdemo.entity.Points;
import com.coding24.mybatisdemo.mapper.PointsMapper;
import com.coding24.mybatisdemo.service.PointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PointsServiceImpl implements PointsService {
    @Autowired
    private PointsMapper pointsMapper;
    /**
     * @param position_id
     */
    @Override
    public void deletePoints(int position_id) {
        pointsMapper.deletePoints(position_id);
    }

    /**
     * @param points
     */
    @Override
    public void insertPoints(Points points) {
        pointsMapper.insertPoints(points);
    }

    /**
     * @param pid
     * @return
     */
    @Override
    public Points[] findByPid(int pid) {
        return pointsMapper.findByPid(pid);
    }

    /**
     * @param position_id
     * @return
     */
    @Override
    public Points findByPosition_id(int position_id) {
        return pointsMapper.findByPosition_id(position_id);
    }

    /**
     * @return
     */
    @Override
    public Points[] findAll() {
        return pointsMapper.findAll();
    }

    /**
     * @param points
     */
    @Override
    public void updatePoints(Points points) {
        pointsMapper.updatePoints(points);
    }
}
