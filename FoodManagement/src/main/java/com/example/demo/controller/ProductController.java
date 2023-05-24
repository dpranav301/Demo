package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ProductService;
import com.example.demo.model.Product;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	@PostMapping("/create")
	public Product createProduct(@RequestBody Product p)
	{
		Product createProduct=productService.createProduct(p);
		return createProduct;
	}
	@GetMapping("/viewAll")
	public List<Product> viewAllProduct()
	{
		List<Product> viewAll=productService.viewAll();
		return viewAll;
	}
	@GetMapping("/view/{productId}")
	public Product viewProductById(@PathVariable int productId)
	{
		Product viewById=productService.viewProductById(productId);
		return viewById;
		
	}
	@DeleteMapping("/delete/{productId}")
	public void deleteProduct(@PathVariable int productId)
	{
		productService.deleteProduct(productId);
	}
}
