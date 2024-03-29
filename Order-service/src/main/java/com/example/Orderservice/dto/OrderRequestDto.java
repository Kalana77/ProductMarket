package com.example.Orderservice.dto;

import com.example.Orderservice.model.OrderLineItems;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequestDto {
    private List<OrderLineItemsDto> orderLineItemsDtoList;
}
