package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping  ("/showForm")
    public String showForm(Model uiModel) {
        Product product = new Product();
        uiModel.addAttribute("product", product);
        return "product-form";
    }

    @RequestMapping ("/processForm")
    public String showResult(@ModelAttribute("product") Product product) {
        System.out.println(product);
        productService.addToProductRepo(product);
        return "product-list";
    }

    @RequestMapping("/showAllProducts")
    public String showAllProduct(Model uiModel) {
        uiModel.addAttribute("productList", productService.getAllProduct());
        return "allProducts";
    }

    @RequestMapping(path = "/showProductById", method = RequestMethod.GET)
    @ResponseBody
    public Product showProductById(Model uiModel, @RequestParam int id) {
        Product product = productService.getProductById(id);
        return product;
    }

}
