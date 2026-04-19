package project.product.management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import project.product.management.entity.Product;
import project.product.management.service.ProductService;

@RestController
public class ProductController {
	
	ProductService service;

	public ProductController(ProductService service) {
		super();
		this.service = service;
	} 
	
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody Product prod) {
		return service.addProduct(prod);
	}

	@PatchMapping("/updateProduct")
	public String updateProduct(@RequestBody Product prod) {
		return service.updateProduct(prod);
	}

	@DeleteMapping("/deleteProduct/{prodId}")
	public String deleteProduct(@PathVariable Long prodId) {
		return service.deleteProduct(prodId);
	}

	@GetMapping("/viewProduct/{prodId}")
	public Product viewProduct(@PathVariable Long prodId) {
		return service.viewProduct(prodId);
	}

	@GetMapping("/viewAllProduct")
	public List<Product> viewAllProduct() {
		
		return service.viewAllProduct();
	}
	
}
