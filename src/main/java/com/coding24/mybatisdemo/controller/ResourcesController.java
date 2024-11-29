package com.coding24.mybatisdemo.controller;

import com.coding24.mybatisdemo.entity.resources;
import com.coding24.mybatisdemo.service.ResourcesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resources")
public class ResourcesController {
    private static final Logger logger = LoggerFactory.getLogger(ResourcesController.class);

    @Autowired
    private ResourcesService resourcesService;

    @PostMapping("/insert")
    public void insert(@RequestBody resources resources) {
        logger.info("开始插入资源: {}", resources);
        resourcesService.insert(resources);
        logger.info("资源插入成功: {}", resources);
    }

    @PostMapping("/update")
    public void update(@RequestBody resources resources) {
        logger.info("开始更新资源: {}", resources);
        resourcesService.update(resources);
        logger.info("资源更新成功: {}", resources);
    }

    @PostMapping("/deleteById")
    public void deleteById(@RequestBody Integer id) {
        logger.info("开始删除资源, ID: {}", id);
        resourcesService.deleteById(id);
        logger.info("资源删除成功, ID: {}", id);
    }

    @PostMapping("/findById")
    public resources findById(@RequestBody Integer id) {
        logger.info("开始查找资源, ID: {}", id);
        resources resource = resourcesService.findById(id);
        logger.info("资源查找成功, ID: {}, 资源: {}", id, resource);
        return resource;
    }

    @GetMapping("/findAll")
    public resources[] findAll() {
        logger.info("开始查找所有资源");
        resources[] resourcesList = resourcesService.findAll();
        logger.info("所有资源查找成功, 数量: {}", resourcesList.length);
        return resourcesList;
    }

    @PostMapping("/classification")
    public resources[] findByClassification(@RequestParam String classification) {
        logger.info("开始根据分类查找资源, 分类: {}", classification);
        resources[] resourcesList = resourcesService.findByClassification(classification);
        logger.info("资源查找成功, 数量: {}", resourcesList.length);
        return resourcesList;
    }
}
