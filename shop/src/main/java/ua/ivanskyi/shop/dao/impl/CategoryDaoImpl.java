package ua.ivanskyi.shop.dao.impl;

import org.springframework.stereotype.Repository;

import ua.ivanskyi.shop.dao.CategoryDao;
import ua.ivanskyi.shop.entity.Category;

@Repository
public class CategoryDaoImpl extends BaseOperationImpl<Category, Long> implements CategoryDao {

	public CategoryDaoImpl() {
		super(Category.class);
	}

}
