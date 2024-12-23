package com.coding24.mybatisdemo.controller;

import com.coding24.mybatisdemo.entity.Points;
import com.coding24.mybatisdemo.service.PointsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/points")
public class PointsController {
    private static final Logger logger = LoggerFactory.getLogger(PointsController.class);

    @Autowired
    private PointsService pointsService;

    @RequestMapping("/delete")
    public void deletePoints(
          @RequestParam int position_id) {
        logger.info("删除位置ID为 {} 的地点", position_id);
        pointsService.deletePoints(position_id);
    }

    @RequestMapping("/findAll")
    public Points[] findAll() {
        logger.info("查询所有地点");
        return pointsService.findAll();
    }

    @RequestMapping("/findByPid")
    public Points[] findByPid(
   @RequestParam int pid) {
        logger.info("根据PID {} 查询地点", pid);
        return pointsService.findByPid(pid);
    }

    @RequestMapping("/findByPosition_id")
    public Points findByPosition_id(
            @RequestParam int position_id) {
        logger.info("根据ID {} 查询地点", position_id);
        return pointsService.findByPosition_id(position_id);
    }

    @RequestMapping("/insert")
    public Points insertPoints(
         @RequestBody Points points) {
        logger.info("插入新地点: {}", points);
        pointsService.insertPoints(points);
        logger.info("插入新地点成功: {}", points);
        return points;
    }

    @RequestMapping("/update")
    public void updatePoints(
     @RequestBody Points points) {
        logger.info("更新地点: {}", points);
        pointsService.updatePoints(points);
        logger.info("更新地点成功: {}", points);
    }
}
