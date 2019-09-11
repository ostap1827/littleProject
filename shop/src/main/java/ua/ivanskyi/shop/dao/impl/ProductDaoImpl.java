package ua.ivanskyi.shop.dao.impl;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.ivanskyi.shop.dao.ProductDao;
import ua.ivanskyi.shop.entity.Product;

@Repository
public class ProductDaoImpl extends BaseOperationImpl<Product, Long> implements ProductDao {
	public ProductDaoImpl() {
		super(Product.class);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Product> findByCategory(String categoryName) {
		try {
			return entityManager.createQuery("SELECT p FROM Product p WHERE p.category.categoryName = :findCategory")
					.setParameter("findCategory", categoryName).getResultList();
		} catch (NoResultException e) {

			return null;
		}
	}
}
