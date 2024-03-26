package com.softdreams.ecommerce.dto;

import lombok.Data;

@Data
public class PurchaseResponse {

    //lombok will generate the constructor for final fields
    private final String orderTrackingNumber;
}
