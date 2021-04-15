package com.springjpaassignment.spjpaassign.repository;

import com.springjpaassignment.spjpaassign.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
