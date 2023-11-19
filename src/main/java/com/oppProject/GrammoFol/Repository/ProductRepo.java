package com.oppProject.GrammoFol.Repository;

import com.oppProject.GrammoFol.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {
    List<Product> findAllByCategory_Id(int id);
}
