package com.example.fileserver.config.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface fileUpload {

    String uploadFile(MultipartFile multipartFile)throws IOException;


}
