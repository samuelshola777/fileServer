package com.example.fileserver.config.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileUploads {

    String uploadFile(MultipartFile multipartFile)throws IOException;


}
