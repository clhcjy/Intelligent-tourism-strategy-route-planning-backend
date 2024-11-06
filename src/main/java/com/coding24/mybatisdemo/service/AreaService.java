package com.coding24.mybatisdemo.service;

import com.coding24.mybatisdemo.entity.Area;

public interface AreaService {
    public void save(Area area);
    public void delete(int aid);
    public void update(Area area);
    public Area findById(int aid);
    public Area findByAddress(String Address);
    public Area findByCity(String City);
    public Area findByDistrict(String District);
    public Area findByProvince(String Province);
    public Area findByStreet(String Street);
    public Area findAll();
}
