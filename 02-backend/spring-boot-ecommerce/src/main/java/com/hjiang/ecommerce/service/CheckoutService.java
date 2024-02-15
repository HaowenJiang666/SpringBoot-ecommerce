package com.hjiang.ecommerce.service;

import com.hjiang.ecommerce.dto.Purchase;
import com.hjiang.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
