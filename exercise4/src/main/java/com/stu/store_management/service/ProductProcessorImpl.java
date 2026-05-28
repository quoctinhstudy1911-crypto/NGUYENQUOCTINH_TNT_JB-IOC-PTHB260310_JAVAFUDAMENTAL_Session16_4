package com.stu.store_management.service;

import com.stu.store_management.entity.Product;
import com.stu.store_management.entity.ProductProcessor;

import java.util.List;

public class ProductProcessorImpl implements ProductProcessor {

    @Override
    public double calculateTotalValue(List<Product> products) {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
}
}
