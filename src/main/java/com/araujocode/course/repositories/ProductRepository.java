package com.araujocode.course.repositories;

import com.araujocode.course.entities.Category;
import com.araujocode.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
