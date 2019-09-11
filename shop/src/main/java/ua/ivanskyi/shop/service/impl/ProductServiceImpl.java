package ua.ivanskyi.shop.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.ivanskyi.shop.dao.ProductDao;
import ua.ivanskyi.shop.entity.Product;
import ua.ivanskyi.shop.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;

	@Transactional
	public List<Product> getAllProduct() {

		return productDao.findAll();
	}

	@Transactional
	public Product getProductInfo(long productId) {
		Product product = productDao.findById(productId);
		if (product != null) {
			return product;
		} else {
			return new Product();
		}
	}

	@Transactional
	public void saveProduct(String productName, String reference, int price) {
		productDao.save(new Product(productName, reference, price));

	}

	@Transactional
	public List<Product> getProductByCategory(String categoryName) {
		return productDao.findByCategory(categoryName);
	}
}
