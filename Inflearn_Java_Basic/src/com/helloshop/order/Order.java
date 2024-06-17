package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {
    User user;
    Product product; // 해당 어플리케이션에서 사용하는 User, Product import

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
