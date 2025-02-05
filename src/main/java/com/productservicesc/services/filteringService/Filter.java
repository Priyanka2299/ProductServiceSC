package com.productservicesc.services.filteringService;

import com.productservicesc.models.Product;

import java.util.List;

public interface Filter {

    List<Product> apply(List<Product> products,
                        List<String> allowedValues);
}