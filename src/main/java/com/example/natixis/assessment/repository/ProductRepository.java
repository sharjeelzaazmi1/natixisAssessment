package com.example.natixis.assessment.repository;

import com.example.natixis.assessment.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}