package ru.dorokhov.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dorokhov.spring.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
