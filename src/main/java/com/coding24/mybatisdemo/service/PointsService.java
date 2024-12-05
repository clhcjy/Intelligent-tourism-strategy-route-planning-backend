package com.coding24.mybatisdemo.service;

import com.coding24.mybatisdemo.entity.Points;

public interface PointsService {
    public void deletePoints(int position_id);
    public void insertPoints(Points points);
    public Points[] findByPid(int pid);
    public Points findByPosition_id(int position_id);
    public Points[] findAll();
    public void updatePoints(Points points);
}
