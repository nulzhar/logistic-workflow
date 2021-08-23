package com.nulzhar.logistic_workflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public List<Product> get(){
        return productService.getProducts();
    }

    @PostMapping()
    public Product post(@RequestBody Product product){
        return productService.saveProduct(product);
    }
}
