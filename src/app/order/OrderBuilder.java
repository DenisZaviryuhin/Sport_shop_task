package app.order;

import app.caps.BlackCap;
import app.caps.WhiteCap;
import app.order.Order;
import app.tShirts.BlueTShirt;
import app.tShirts.RedTShirt;

public class OrderBuilder {
    public Order makeOrderA(){
        Order order = new Order();
        order.addItem(new RedTShirt());
        order.addItem(new WhiteCap());
        return order;
    }
    public Order makeOrderB(){
        Order order = new Order();
        order.addItem(new BlueTShirt());
        order.addItem(new BlackCap());
        return order;
    }
}
