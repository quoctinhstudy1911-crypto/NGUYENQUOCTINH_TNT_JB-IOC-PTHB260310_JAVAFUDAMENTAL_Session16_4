package com.stu.store_management.presentation;

import com.stu.store_management.entity.Product;
import com.stu.store_management.entity.ProductProcessor;
import com.stu.store_management.service.ProductProcessorImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductProcessorImpl productProcessor = new ProductProcessorImpl();

        List<Product> productList = List.of(
                new Product("Kẹp tóc",100),
                new Product("Quần kaki",130000),
                new Product("Áo thun",100)
        );
        System.out.println("Kiểm tra có sản phẩm nào trên 100");
       if( !productProcessor.hasExpensiveProduct(productList))
       {
           System.out.println("Không có sản phẩm nào đắt cả");
       }
       else
       {
           System.out.println("Có sản phẩm đắt tiền");
       }

        System.out.println();
        System.out.println("Duyệt danh sách");
        ProductProcessor.printProductList(productList);

        System.out.println();
        System.out.println("Tính tổng giá trị của sản phẩm: ");
        double sumProduct = productProcessor.calculateTotalValue(productList);

        System.out.println("Tổng giá trị của sản phẩm là: "+ sumProduct );



    }
}

