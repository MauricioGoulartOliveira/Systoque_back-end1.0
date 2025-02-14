package com.systoque_back_end.service;

import com.systoque_back_end.exception.ProductNotFoundException;
import com.systoque_back_end.model.Product;
import com.systoque_back_end.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Product update(Long id, Product updatedProduct) {
        return productRepository.findById(id).map(product -> {
            product.setName(updatedProduct.getName());
            product.setPrice(updatedProduct.getPrice());
            product.setQuantityInStock(updatedProduct.getQuantityInStock());
            product.setDescription(updatedProduct.getDescription());
            return productRepository.save(product);
        }).orElseThrow(() -> new ProductNotFoundException("Produto não encontrado com o ID: " + id));
    }

    public void delete(Long id) {
        if (!productRepository.existsById(id)) {
            throw new ProductNotFoundException("Produto não encontrado com o ID: " + id);
        }
        productRepository.deleteById(id);
    }
}