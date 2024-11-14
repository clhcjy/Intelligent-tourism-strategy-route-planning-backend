package com.coding24.mybatisdemo.controller;

import com.coding24.mybatisdemo.entity.Traving;
import com.coding24.mybatisdemo.service.TravingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/traving")
public class TravingController {

    private static final Logger logger = LoggerFactory.getLogger(TravingController.class);

    @Autowired
    private TravingService travingService;

    @PostMapping("/delete")
    public void deleteTraving(@RequestParam int tid) {
        logger.info("正在删除旅行记录，ID: {}", tid);
        travingService.deleteTraving(tid);
        logger.info("旅行记录删除成功，ID: {}", tid);
    }

    @PostMapping("/insert")
    public void insertTraving(@RequestBody Traving traving) {
        logger.info("正在插入旅行记录: {}", traving);
        travingService.insertTraving(traving);
        logger.info("旅行记录插入成功: {}", traving);
    }

    @GetMapping("/selectById")
    public Traving selectTraving(@RequestParam int tid) {
        logger.info("根据ID查询旅行记录: {}", tid);
        Traving traving = travingService.selectTraving(tid);
        if (traving != null) {
            logger.info("找到旅行记录，ID: {}, 内容: {}", tid, traving);
        } else {
            logger.warn("未找到旅行记录，ID: {}", tid);
        }
        return traving;
    }

    @GetMapping("/selectByUid")
    public Traving selectTravingByUid(@RequestParam int uid) {
        logger.info("根据UID查询旅行记录: {}", uid);
        Traving traving = travingService.selectTravingByUid(uid);
        if (traving != null) {
            logger.info("找到旅行记录，UID: {}, 内容: {}", uid, traving);
        } else {
            logger.warn("未找到旅行记录，UID: {}", uid);
        }
        return traving;
    }

    @PostMapping("/update")
    public void updateTraving(@RequestBody Traving traving) {
        logger.info("正在更新旅行记录: {}", traving);
        travingService.updateTraving(traving);
        logger.info("旅行记录更新成功: {}", traving);
    }
}
