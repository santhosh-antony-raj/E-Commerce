package com.example.SpringEcom.repo;

import com.example.SpringEcom.model.Product;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
