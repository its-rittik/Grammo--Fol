package com.oppProject.GrammoFol.DataTransferObject;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
public class ProductDTO {
    private Long id;
    private String name;
    private int categoryId;
    private double price;
    private  int weight;
    private String description;
    private String imageName;
}