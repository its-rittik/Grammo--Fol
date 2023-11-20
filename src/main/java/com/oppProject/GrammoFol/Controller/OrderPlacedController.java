package com.oppProject.GrammoFol.Controller;

import com.oppProject.GrammoFol.global.GlobalData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderPlacedController {

    @PostMapping("/payNow")
    public String payNow(Model model) {
        // Perform payment logic

        // Assuming GlobalData.cart represents your shopping cart
        if (!GlobalData.cart.isEmpty()) {
            GlobalData.cart.get(0).decreaseItemCount();
        }

        // Add any additional information to the model for the paySuccess view
        model.addAttribute("paymentStatus", "success");

        return "paySuccess";
    }
}
