package ru.dorokhov.spring.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dorokhov.spring.entity.Category;
import ru.dorokhov.spring.repository.CategoryRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<Category> readAll() {
        return categoryRepository.findAll();
    }

    public Category readById(Long id) {
        return categoryRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Category not found - " + id)
        );
    }

    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }
}
