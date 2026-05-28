package com.stu.store_management.entity;

import java.util.List;

public interface ProductProcessor {
    double calculateTotalValue(List<Product> products);
    static void printProductList(List<Product> products)
    {
        products.forEach(System.out::println);
    }

    default boolean hasExpensiveProduct(List<Product> products)
    {
      Long count =  products.stream()
                .filter(product -> product.getPrice()>100)
                .count();

        return count > 0;
    }

}
