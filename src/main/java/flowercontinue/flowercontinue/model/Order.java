package flowercontinue.flowercontinue.model;

import java.util.List;

public class Order {
    private List<Item> items;
    private double totalPrice;

    public Order(List<Item> items) {
        this.items = items;
        this.totalPrice = calculateTotalPrice();
    }

    private double calculateTotalPrice() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    // Геттери
    public List<Item> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}