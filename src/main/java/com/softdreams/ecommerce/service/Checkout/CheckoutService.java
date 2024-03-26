package com.softdreams.ecommerce.service.Checkout;

import com.softdreams.ecommerce.dto.Purchase;
import com.softdreams.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
