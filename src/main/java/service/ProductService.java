package service;

import entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProduct() {
        return productRepository.getProductList();
    }

    public void addToProductRepo(Product product) {
        productRepository.addToRepo(product);
    }

    public Product getProductById(int id) {
        return productRepository.getProductById(id);
    }
}
