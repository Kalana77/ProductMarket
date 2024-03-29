package com.example.Productservice.Service;

import com.example.Productservice.Service.impl.ProductServiceImpl;
import com.example.Productservice.dto.ProductRequestDto;
import com.example.Productservice.dto.ProductResponseDto;

import java.util.List;

public interface ProductService {
    String addProduct(ProductRequestDto productRequestDto);

    List<ProductResponseDto> getAllProduct();
}
