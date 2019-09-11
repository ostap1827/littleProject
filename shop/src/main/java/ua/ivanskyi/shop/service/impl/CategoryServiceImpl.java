package ua.ivanskyi.shop.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.ivanskyi.shop.dao.CategoryDao;
import ua.ivanskyi.shop.entity.Category;
import ua.ivanskyi.shop.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryDao categoryDao;

	@Transactional
	public List<Category> findAllCategory() {
		return categoryDao.findAll();
	}

	@Transactional
	public Category findCategory(long categoryId) {

		return categoryDao.findById(categoryId);

	}

	@Transactional
	public void saveCategory(String categoryName) {
		categoryDao.save(new Category(categoryName));
	}

}
