package com.example.Orderservice.dto;


import lombok.*;

import java.math.BigDecimal;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemsDto {
    //private long id;
    private String skuCode;
    private BigDecimal price;
    private int quantity;
}
