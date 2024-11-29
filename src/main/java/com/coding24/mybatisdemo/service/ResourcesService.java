package com.coding24.mybatisdemo.service;

import com.coding24.mybatisdemo.entity.resources;

public interface ResourcesService {
    void insert(resources resources);
    resources findById(Integer id);
    resources[] findAll();
    void deleteById(Integer id);
    void update(resources resources);
    resources[] findByClassification(String classification);
}
