package com.oppProject.GrammoFol.Model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id" , referencedColumnName = "category_id")
    private  Category category;
    private double price;
    private double weight;
    private String description;
    private String imageName;

    private int itemCount;

    // constructor, getters, setters, and other methods...

    public void decreaseItemCount() {
        // Ensure the item count is greater than 0 before decrementing
        if (itemCount > 0) {
            itemCount--;
        }
    }
}

