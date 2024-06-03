package com.example.order_service.service;

import com.example.order_service.dto.OrderLineItemsDto;
import com.example.order_service.dto.OrderRequest;
import com.example.order_service.model.Order;
import com.example.order_service.model.OrderLineItems;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface OrderService {
    public void placeOrder(OrderRequest orderRequest);




}
