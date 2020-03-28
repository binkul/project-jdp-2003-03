package com.kodilla.ecommercee.repository;

import com.kodilla.ecommercee.entity.ProductGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductGroupRepository extends JpaRepository<ProductGroup, Long> {
    List<ProductGroup> findByName(String name);
}