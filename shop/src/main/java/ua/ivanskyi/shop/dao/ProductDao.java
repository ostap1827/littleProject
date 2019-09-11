package ua.ivanskyi.shop.dao;

import java.util.List;

import ua.ivanskyi.shop.entity.Product;

public interface ProductDao extends BaseOperation<Product, Long> {

	List<Product> findByCategory(String categoryName);
}
