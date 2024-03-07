package com.emart.services;

import java.util.List;

import com.emart.entities.ProductMaster;

public interface ProductMasterService 
{

	List<ProductMaster> getAllProducts();

	ProductMaster getProductById(int productId);

	ProductMaster addProduct(ProductMaster product);

	void deleteProduct(int productId);

	ProductMaster updateProduct(int productId, ProductMaster updatedProduct);
	
	List<ProductMaster> getProductsByPriceRange(double minPrice, double maxPrice);
	
	List<ProductMaster> getProductsWithValidDiscount();
	
	List<ProductMaster> findByCatID(int id);
	

}
