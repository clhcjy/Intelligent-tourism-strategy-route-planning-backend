package com.coding24.mybatisdemo.service;

import com.coding24.mybatisdemo.entity.Traving;

public interface TravingService {
    public void deleteTraving(int tid);
    public void insertTraving(Traving traving);
    public Traving selectTraving(int tid);
    public Traving selectTravingByUid(int uid);
    public void updateTraving(Traving traving);
}
