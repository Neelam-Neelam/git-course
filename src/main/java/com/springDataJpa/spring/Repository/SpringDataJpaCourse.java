package com.springDataJpa.spring.Repository;

import com.springDataJpa.spring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaCourse extends JpaRepository<Product, Long> {
}
