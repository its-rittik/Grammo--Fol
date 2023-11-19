package com.oppProject.GrammoFol.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderPlacedController {

    @GetMapping("/orderPlaced")
    public String showOrderPlacedPage() {
        return "orderPlaced";
    }
}

