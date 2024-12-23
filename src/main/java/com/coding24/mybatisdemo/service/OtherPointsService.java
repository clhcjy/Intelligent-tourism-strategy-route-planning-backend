package com.coding24.mybatisdemo.service;

import com.coding24.mybatisdemo.entity.OtherPoints;

public interface OtherPointsService {
    public void deleteOtherPoints(int OtherPoints_id);
    public void insertOtherPoints(OtherPoints OtherPoints);
    public OtherPoints[] findByPoint_address(String point_address,String category);
    public OtherPoints findByOtherPoints_id(int OtherPoints_id);
    public OtherPoints[] findAll();
    public void updateOtherPoints(OtherPoints OtherPoints);
}
