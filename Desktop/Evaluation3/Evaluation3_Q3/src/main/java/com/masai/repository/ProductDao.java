package com.masai.repository;

import java.util.*;

import com.masai.Exception.ProductException;
import com.masai.modal.Product;

public interface ProductDao {
	
	public boolean addProduct(Product product);
	public List<Product> getAllProducts();
	public Product getProductById(int productId)throws ProductException;
	public List<Product> getProductsBetweenPrice(int fromPrice, int toPrice)throws ProductException;
}
