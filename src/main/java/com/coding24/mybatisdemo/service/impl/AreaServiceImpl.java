package com.coding24.mybatisdemo.service.impl;

import com.coding24.mybatisdemo.entity.Area;
import com.coding24.mybatisdemo.mapper.AreaMapper;
import com.coding24.mybatisdemo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaMapper areaMapper;

    @Override
    public void save(Area area) {
        areaMapper.insert(area);
    }

    @Override
    public void delete(int aid) {
        areaMapper.delete(aid);
    }

    @Override
    public void update(Area area) {
        areaMapper.update(area);
    }

    @Override
    public Area findById(int aid) {
        return areaMapper.findById(aid);
    }

    @Override
    public Area findByAddress(String Address) {
        return areaMapper.findByAddress(Address);
    }

    @Override
    public Area findByCity(String City) {
        return areaMapper.findByCity(City);
    }

    @Override
    public Area findByDistrict(String District) {
        return areaMapper.findByDistrict(District);
    }

    @Override
    public Area findByProvince(String Province) {
        return areaMapper.findByProvince(Province);
    }

    @Override
    public Area findByStreet(String Street) {
        return areaMapper.findByStreet(Street);
    }

    @Override
    public Area findAll() {
        return areaMapper.findAll();
    }
}
