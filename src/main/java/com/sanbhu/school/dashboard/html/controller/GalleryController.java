/**
 * @#GalleryController.java October 24, 2018
 */
package com.sanbhu.school.dashboard.html.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanbhu.school.dashboard.controller.BaseHtmlController;

/**
 * Class used for showing gallery content on gallery page.
 *
 * @author Bhushan Patil
 */
@Controller
public class GalleryController extends BaseHtmlController {

	/**
	 * Method used to show gallery page.
	 *
	 * @param model Map instance.
	 * @return String instance.
	 */
	@RequestMapping("/gallery")
	public String showGallery(Map<String, Object> model) {
		return "gallery/galleryDisplay";
	}

}
