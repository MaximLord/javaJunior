package oop.task_final;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Warehouse {
    private Map<String, Product> products = new HashMap<>();

    public void addProduct(Product p, int stock) {
        p.stock += stock; // Увеличиваем текущий запас товара
        products.put(p.id, p);
    }

    public List<Product> getAvailableProducts() {
        List<Product> available = new ArrayList<>();
        for (Product p : products.values()) {
            if (p.isInStock()) {
                available.add(p);
            }
        }
        return available;
    }

    public double totalValue() {
        double total = 0;
        for (Product p : products.values()) {
            total += p.price * p.stock;
        }
        return total;
    }
}
