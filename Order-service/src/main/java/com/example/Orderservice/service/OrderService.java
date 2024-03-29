package com.example.Orderservice.service;

import com.example.Orderservice.dto.OrderRequestDto;
import org.springframework.stereotype.Service;


public interface OrderService {


    void placeOrder(OrderRequestDto orderRequestDto);
}
