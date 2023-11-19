package com.oppProject.GrammoFol.Repository;

import com.oppProject.GrammoFol.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
