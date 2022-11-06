package com.niit.restapi.service;

import com.niit.restapi.domain.Product;

import java.util.List;

public interface ProductService {
    Product addProduct(Product product);

    List<Product> getAllProduct();
}
