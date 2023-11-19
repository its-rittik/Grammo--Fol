package com.oppProject.GrammoFol.global;

import com.oppProject.GrammoFol.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<Product> cart;
    static {
        cart = new ArrayList<Product>();
    }
}
