package com.coding24.mybatisdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/upload")
public class FileUploadController {

    private static final String UPLOAD_DIR = "uploads/";

    @PostMapping("/User")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("请选择一个文件上传");
        }

        try {
            // 检查文件类型
            if (!file.getContentType().equals("image/jpeg") && !file.getContentType().equals("image/png")) {
                return ResponseEntity.badRequest().body("只允许 JPEG 和 PNG 类型文件上传");
            }

            // 检查文件大小
            if (file.getSize() > 2 * 1024 * 1024) {
                return ResponseEntity.badRequest().body("文件超过大小 》 2MB.");
            }

            // 保存文件
            Path filePath = Paths.get(UPLOAD_DIR + file.getOriginalFilename());
            Files.createDirectories(filePath.getParent());
            Files.write(filePath, file.getBytes());
            // 生成文件访问链接
            String fileUrl = "http://localhost:8080/files/" + file.getOriginalFilename();
            return ResponseEntity.ok("文件上传成功:+" + fileUrl);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().body("文件上传失败:+" + e.getMessage());
        }
    }
}

