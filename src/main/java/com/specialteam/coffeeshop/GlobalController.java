package com.specialteam.coffeeshop;

import com.specialteam.coffeeshop.product.service.ProductService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GlobalController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public ModelAndView main(ModelMap map, HttpServletRequest request) {

        return new ModelAndView("index", map);
    }
}
