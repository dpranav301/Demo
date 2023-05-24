package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepo;

	public Product createProduct(Product product)
	{
		Product save=productRepo.save(product);
		return save;
	}
	public List<Product> viewAll()
	{
		List<Product> getAll=productRepo.findAll();
		return getAll;
	}
	public Product viewProductById(int id)
	{
		Product product=productRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Not Found"));
		return product;
	}
	public void deleteProduct(int id)
	{
		productRepo.deleteById(id);
	}
}
