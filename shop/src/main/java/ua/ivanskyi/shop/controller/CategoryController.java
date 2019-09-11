package ua.ivanskyi.shop.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ua.ivanskyi.shop.entity.Category;
import ua.ivanskyi.shop.service.CategoryService;

@Controller
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "categories/all", method = RequestMethod.GET)
	public @ResponseBody List<String> getCategory() {
		List<String> categoryList = new ArrayList<String>();
		for (Category c : categoryService.findAllCategory()) {
			categoryList.add(c.getCategoryName().toLowerCase());
		}
		return categoryList;

	}

}
