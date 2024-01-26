package app.order;

import app.itemInterface.Item;
import app.rounder.Rounder;

import java.util.List;
import java.util.ArrayList;

public class Order {
    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);

    }

    public String getCost() {
        double cost = 0.00;
        for (Item item : items) {
            cost += item.price();

        }
        return Rounder.roundValue(cost);
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item: " + item.name());
            System.out.print(", Brand: " + item.brand().addBrand());
            System.out.println(", Price: " + item.price());

        }

    }
}
