package com.productservicesc.services.filteringService;

import com.productservicesc.models.Product;

import java.util.List;

public class BrandFilter implements Filter {

    @Override
    public List<Product> apply(List<Product> products, List<String> allowedValues) {
        return List.of();
    }
}