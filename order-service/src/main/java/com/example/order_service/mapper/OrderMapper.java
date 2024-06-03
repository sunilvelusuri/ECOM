package com.example.order_service.mapper;

import com.example.order_service.dto.OrderLineItemsDto;
import com.example.order_service.model.OrderLineItems;

public class OrderMapper {
    public static OrderLineItems mapToDto(OrderLineItemsDto orderLineItemsDto){
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setPrice(orderLineItems.getPrice());
        orderLineItems.setQuantity(orderLineItems.getQuantity());
        orderLineItems.setSkuCode(orderLineItems.getSkuCode());
        return orderLineItems;
    }
}
