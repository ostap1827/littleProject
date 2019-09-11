package ua.ivanskyi.shop.service;

import java.util.List;

import ua.ivanskyi.shop.entity.Product;

public interface ProductService {
	List<Product> getAllProduct();

	Product getProductInfo(long productId);

	List<Product> getProductByCategory(String categoryName);

	void saveProduct(String productName, String reference, int price);
}
