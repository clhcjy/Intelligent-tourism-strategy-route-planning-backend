package com.coding24.mybatisdemo.service.impl;

import com.coding24.mybatisdemo.entity.resources;
import com.coding24.mybatisdemo.mapper.ResourcesMapper;
import com.coding24.mybatisdemo.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourcesServiceImpl implements ResourcesService {
    @Autowired
    private ResourcesMapper resourcesMapper;
    /**
     * @param resources
     */
    @Override
    public void insert(resources resources) {
        resourcesMapper.insert(resources);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public resources findById(Integer id) {
        return resourcesMapper.findById(id);
    }

    /**
     * @return
     */
    @Override
    public resources[] findAll() {
        return resourcesMapper.findAll();
    }

    /**
     * @param id
     */
    @Override
    public void deleteById(Integer id) {
        resourcesMapper.deleteById(id);
    }

    /**
     * @param resources
     */
    @Override
    public void update(resources resources) {
        resourcesMapper.update(resources);
    }

    /**
     * @param classification
     * @return
     */
    @Override
    public resources[] findByClassification(String classification) {
        return resourcesMapper.findByClassification(classification);
    }

    @Override
    public resources[] findByTitle(String title) {
        return resourcesMapper.findByTitle(title);
    }
}
