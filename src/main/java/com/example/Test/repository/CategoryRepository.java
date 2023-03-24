package com.example.Test.repository;

import com.example.Test.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity,Long> {

    CategoryEntity findOneByCode(String code);
}
