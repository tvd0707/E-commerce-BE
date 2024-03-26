package com.softdreams.ecommerce.dto;

import com.softdreams.ecommerce.entity.Address;
import com.softdreams.ecommerce.entity.Customer;
import com.softdreams.ecommerce.entity.Order;
import com.softdreams.ecommerce.entity.OrderItem;
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
