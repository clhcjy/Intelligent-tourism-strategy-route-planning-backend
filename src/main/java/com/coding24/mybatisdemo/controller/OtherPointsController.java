package com.coding24.mybatisdemo.controller;

import com.coding24.mybatisdemo.entity.OtherPoints;
import com.coding24.mybatisdemo.service.OtherPointsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/otherPoints")
public class OtherPointsController {
    private static final Logger logger = LoggerFactory.getLogger(OtherPointsController.class);

    @Autowired
    OtherPointsService otherPointsService;

    @PostMapping("/delete")
    public void deleteOtherPoints(@RequestParam int OtherPoints_id) {
        logger.info("删除关联景点信息，ID: {}", OtherPoints_id);
        otherPointsService.deleteOtherPoints(OtherPoints_id);
    }

    @GetMapping("/findAll")
    public OtherPoints[] findAll() {
        logger.info("查找所有关联景点信息");
        return otherPointsService.findAll();
    }

    @PostMapping("/findByCategory")
    public OtherPoints[] findByPosition_id(@RequestParam String point_address, @RequestParam String category) {
        logger.info("根据地址和类别查找关联景点信息，具体地址: {}, 类别: {}", point_address, category);
        OtherPoints[] otherPoints = otherPointsService.findByPoint_address(point_address, category);
        if(otherPoints.length == 0){logger.info("没有找到任何匹配项");return otherPoints;}else{logger.info("找到{}个匹配项，具体为：{}", otherPoints.length,otherPoints);}
        return otherPoints;
    }

    @PostMapping("/findByOtherPoints_id")
    public OtherPoints findByOtherPoints_id(@RequestParam int OtherPoints_id) {
        logger.info("根据ID查找关联景点信息，ID: {}", OtherPoints_id);
        return otherPointsService.findByOtherPoints_id(OtherPoints_id);
    }

    @PostMapping("/insert")
    public void insertOtherPoints(@RequestBody OtherPoints OtherPoints) {
        logger.info("插入新的关联景点信息: {}", OtherPoints);
        otherPointsService.insertOtherPoints(OtherPoints);
        logger.info("插入成功");
    }

    @PostMapping("/update")
    public void updateOtherPoints(@RequestParam OtherPoints OtherPoints) {
        logger.info("更新关联景点信息: {}", OtherPoints);
        otherPointsService.updateOtherPoints(OtherPoints);
    }
}
