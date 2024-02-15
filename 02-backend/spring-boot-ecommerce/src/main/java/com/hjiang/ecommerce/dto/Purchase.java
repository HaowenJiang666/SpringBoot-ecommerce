package com.hjiang.ecommerce.dto;

import com.hjiang.ecommerce.entity.Address;
import com.hjiang.ecommerce.entity.Customer;
import com.hjiang.ecommerce.entity.Order;
import com.hjiang.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;

    private Address shippingAddress;

    private Address billingAddress;

    private Order order;

    private Set<OrderItem> orderItems;
}
