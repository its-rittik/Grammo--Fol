package com.oppProject.GrammoFol.Service;

import com.oppProject.GrammoFol.Model.Category;
import com.oppProject.GrammoFol.Repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepo categoryRepo;
    public List<Category> getAllCategories(){
        return categoryRepo.findAll();
    }
    public void addCategory(Category category){
        categoryRepo.save(category);
    }
    public  void removeCatById(int id){
        categoryRepo.deleteById(id);
    }
    public Optional<Category> getCategoryById(int id){
        return categoryRepo.findById(id);
    }
}
