package com.coding24.mybatisdemo.controller;

import com.coding24.mybatisdemo.entity.Area;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/area")
@Slf4j
public class AreaRestController {
    @Autowired
    private com.coding24.mybatisdemo.service.AreaService areaService;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @GetMapping("/all")
    public Area findAll() {
        LocalDateTime now = LocalDateTime.now();
        log.info("[{}] 查询所有区域", now.format(formatter));
        Area result = areaService.findAll();
        log.info("[{}] 查询到所有区域: {}", now.format(formatter), result);
        return result;
    }

    @GetMapping("/{aid}")

    public Area findById( @PathVariable int aid) {
        LocalDateTime now = LocalDateTime.now();
        log.info("[{}] 根据ID查询区域: {}", now.format(formatter), aid);
        Area result = areaService.findById(aid);
        log.info("[{}] 查询到ID为 {} 的区域: {}", now.format(formatter), aid, result);
        return result;
    }

    @GetMapping("/address/{address}")
    public Area findByAddress(@PathVariable String address) {
        LocalDateTime now = LocalDateTime.now();
        log.info("[{}] 根据地址查询区域: {}", now.format(formatter), address);
        Area result = areaService.findByAddress(address);
        log.info("[{}] 查询到地址为 {} 的区域: {}", now.format(formatter), address, result);
        return result;
    }

    @GetMapping("/city/{city}")
    public Area findByCity( @PathVariable String city) {
        LocalDateTime now = LocalDateTime.now();
        log.info("[{}] 根据城市查询区域: {}", now.format(formatter), city);
        Area result = areaService.findByCity(city);
        log.info("[{}] 查询到城市为 {} 的区域: {}", now.format(formatter), city, result);
        return result;
    }

    @GetMapping("/district/{district}")
    public Area findByDistrict(@PathVariable String district) {
        LocalDateTime now = LocalDateTime.now();
        log.info("[{}] 根据区县查询区域: {}", now.format(formatter), district);
        Area result = areaService.findByDistrict(district);
        log.info("[{}] 查询到区县为 {} 的区域: {}", now.format(formatter), district, result);
        return result;
    }

    @GetMapping("/province/{province}")
    public Area findByProvince(@PathVariable String province) {
        LocalDateTime now = LocalDateTime.now();
        log.info("[{}] 根据省份查询区域: {}", now.format(formatter), province);
        Area result = areaService.findByProvince(province);
        log.info("[{}] 查询到省份为 {} 的区域: {}", now.format(formatter), province, result);
        return result;
    }

    @GetMapping("/street/{street}")
    public Area findByStreet( @PathVariable String street) {
        LocalDateTime now = LocalDateTime.now();
        log.info("[{}] 根据街道查询区域: {}", now.format(formatter), street);
        Area result = areaService.findByStreet(street);
        log.info("[{}] 查询到街道为 {} 的区域: {}", now.format(formatter), street, result);
        return result;
    }

    @PostMapping("/")
    public void insert( @RequestBody Area area) {
        LocalDateTime now = LocalDateTime.now();
        log.info("[{}] 插入区域: {}", now.format(formatter), area);
        areaService.save(area);
        log.info("[{}] 插入成功，区域: {}", now.format(formatter), area);
    }

    @PutMapping("/")
    public void update(@RequestBody Area area) {
        LocalDateTime now = LocalDateTime.now();
        log.info("[{}] 更新区域: {}", now.format(formatter), area);
        areaService.update(area);
        log.info("[{}] 更新成功，区域: {}", now.format(formatter), area);
    }

    @DeleteMapping("/{aid}")
    public void delete(@PathVariable int aid) {
        LocalDateTime now = LocalDateTime.now();
        log.info("[{}] 删除ID为 {} 的区域", now.format(formatter), aid);
        areaService.delete(aid);
        log.info("[{}] 删除成功，ID为 {} 的区域", now.format(formatter), aid);
    }
}
