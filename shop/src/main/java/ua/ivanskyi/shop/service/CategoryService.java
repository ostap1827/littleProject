package ua.ivanskyi.shop.service;

import java.util.List;

import ua.ivanskyi.shop.entity.Category;

public interface CategoryService {

	List<Category> findAllCategory();

	Category findCategory(long categoryId);

	void saveCategory(String categoryName);

}
