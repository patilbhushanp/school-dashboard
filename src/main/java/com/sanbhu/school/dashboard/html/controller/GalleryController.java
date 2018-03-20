package com.sanbhu.school.dashboard.html.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanbhu.school.dashboard.controller.BaseHtmlController;

@Controller
public class GalleryController extends BaseHtmlController {
	
	@RequestMapping("/gallery")
	public String showGallery(Map<String, Object> model) {
		return "gallery/galleryDisplay";
	}

}
