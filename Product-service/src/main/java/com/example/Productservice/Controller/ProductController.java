package com.example.Productservice.Controller;

import com.example.Productservice.Service.ProductService;
import com.example.Productservice.dto.ProductRequestDto;
import com.example.Productservice.dto.ProductResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private final ProductService productService;

    @PostMapping("/addProduct")
    @ResponseStatus(HttpStatus.CREATED)
    public String createProduct(@RequestBody ProductRequestDto productRequestDto) {
        String result = productService.addProduct(productRequestDto);
        return result;
    }

    @GetMapping("/getProduct")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponseDto> getAllProducts() {
        List productList = productService.getAllProduct();
        return productList;
    }
}
