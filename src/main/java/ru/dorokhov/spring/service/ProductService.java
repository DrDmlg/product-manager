package ru.dorokhov.spring.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dorokhov.spring.dto.ProductDTO;
import ru.dorokhov.spring.entity.Product;
import ru.dorokhov.spring.repository.ProductRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product create(ProductDTO dto) {
        return productRepository.save(Product.builder()
                .name(dto.getName())
                .amount(dto.getAmount())
                .build());
    }

    public List<Product> readAll() {
        return productRepository.findAll();
    }

    public Product update(Product product) {
        return productRepository.save(product);
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
