package app;

import app.order.Order;
import app.order.OrderBuilder;

public class App {
    public static void main(String[] args) {
        OrderBuilder builder = new OrderBuilder();
        Order orderA = builder.makeOrderA();
        System.out.println("Order A : ");
        orderA.showItems();
        System.out.println("Total cost : " + orderA.getCost());

        Order orderB = builder.makeOrderB();
        System.out.println("Order B : ");
        orderB.showItems();
        System.out.println("Total cost : " + orderB.getCost());


    }
}
