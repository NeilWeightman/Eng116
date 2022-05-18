package com.sparta.shoppingcart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("shoppingCart")
public class ShoppingCartController {

    @PostMapping("/addToCart")
    public String addToCart(final Model model, @ModelAttribute ShoppingCart shoppingCart, final String productCode) {
        if (shoppingCart != null) {
            //add product to the shopping cart list
            shoppingCart.setProduct(productCode);
            model.addAttribute("cart", shoppingCart);
        } else {
            ShoppingCart cart = new ShoppingCart();
            cart.setCustomerName("Super customer");
            cart.setProduct(productCode);
            model.addAttribute("cart", cart);
        }

        return "redirect:" + "product-detail-page";
    }

    @GetMapping("/product-detail-page")
    public String viewPDP(Model model, @ModelAttribute("shoppingCart") ShoppingCart shoppingCart) {
        if (shoppingCart != null) {
            model.addAttribute("cart", shoppingCart);
        } else {
            model.addAttribute("cart", new ShoppingCart());
        }
        return "product";
    }

    @ModelAttribute("shoppingCart")
    public ShoppingCart shoppingCart() {
        return new ShoppingCart();
    }
    @GetMapping("/cart")
    public String cart(@SessionAttribute("shoppingCart") ShoppingCart cart, final Model model) {
        model.addAttribute("cart", cart);
        return "cart";
    }
}
