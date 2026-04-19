package project.product.management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import project.product.management.entity.Product;
import project.product.management.repository.ProductRepository;

@Service
public class ProductServiceImplementation implements ProductService{
	

	ProductRepository repo;
	
	
	public ProductServiceImplementation(ProductRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String addProduct(Product prod) {
		repo.save(prod);
		return "product added successfully!";
	}

	@Override
	public String updateProduct(Product prod) {
		repo.save(prod);
		return "product updated successfully!";
	}

	@Override
	public String deleteProduct(Long prodId) {
		repo.deleteById(prodId);
		return "product deleted successfully!";
	}

	@Override
	public Product viewProduct(Long prodId) {
		return repo.findById(prodId).get();
	}

	@Override
	public List<Product> viewAllProduct() {
		
		return repo.findAll();
	}

}
