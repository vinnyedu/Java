package org.example.application;

import org.example.entities.Order;
import org.example.entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus so1 = OrderStatus.DELIVERED;
        OrderStatus so2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(so1);
        System.out.println(so2);

    }
}
