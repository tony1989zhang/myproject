package net.xgf.service;

import org.springframework.web.multipart.MultipartFile;

import net.xgf.pojo.PictureResult;

public interface PictureService {
	PictureResult uploadPicture(MultipartFile uploadFile);
}
