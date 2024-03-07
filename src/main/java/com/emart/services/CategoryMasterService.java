package com.emart.services;

import java.util.List;

import com.emart.entities.CategoryMaster;

public interface CategoryMasterService {

	void deleteCategory(int categoryId);

	CategoryMaster updateCategory(int categoryId, CategoryMaster updatedCategory);

	CategoryMaster addCategory(CategoryMaster category);

	CategoryMaster getCategoryById(int categoryId);

	List<CategoryMaster> getAllCategorys();
	
	List<CategoryMaster> getCategoriesByCategoryName(String categoryName);

	List<CategoryMaster> findByParentCatID(int id);

	

}
