package com.productservicesc.services.sortingService;

import com.productservicesc.models.Product;

import java.util.List;

public interface Sorter {
    List<Product> sort(List<Product> products);
}