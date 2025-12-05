package api.xtremeshopproducts.repository;

import api.xtremeshopproducts.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Long> {
}