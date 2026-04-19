package project.product.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.product.management.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
