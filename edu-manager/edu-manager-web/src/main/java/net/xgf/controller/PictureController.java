package net.xgf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import net.xgf.pojo.PictureResult;
import net.xgf.service.PictureService;
import net.xgf.utils.JsonUtils;

@Controller
public class PictureController {
	@Autowired
	private PictureService pictureService;
	
	@RequestMapping("/pic/upload")
	@ResponseBody
	public String upload(MultipartFile uploadFile) {
		PictureResult result = pictureService.uploadPicture(uploadFile);
		return JsonUtils.objectToJson(result);
	}
}
