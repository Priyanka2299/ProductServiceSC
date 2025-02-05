package com.productservicesc.services;

import com.productservicesc.exceptions.ProductNotFoundException;
import com.productservicesc.models.Product;

import java.util.List;

public interface ProductService {

    Product createProduct(Product product);

    List<Product> getAllProducts();

    Product partialUpdateProduct(Long productId, Product product) throws ProductNotFoundException;
}