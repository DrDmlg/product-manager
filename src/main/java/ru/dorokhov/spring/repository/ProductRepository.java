package ru.dorokhov.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dorokhov.spring.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
