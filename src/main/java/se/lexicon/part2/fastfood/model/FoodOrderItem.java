package se.lexicon.part2.fastfood.model;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FoodOrderItem implements IOrderItem{
    private final String id;
    private final LocalDateTime dateTime;
    private List<FoodItem> items;

    public FoodOrderItem() {
        this.id = UUID.randomUUID().toString();
        this.dateTime = LocalDateTime.now();
        this.items = new ArrayList<>();
    }

    @Override
    public void addItem(FoodItem item) {
        if (item== null){
            throw new IllegalArgumentException("Item cannot be null");
        }
        items.add(item);

    }

    @Override
    public void removeItem(FoodItem item) {
        if (item== null){
            throw new IllegalArgumentException("Item cannot be null");
        }
        items.remove(item);

    }

    @Override
    public List<FoodItem> getItems() {
        return new ArrayList<>(items);
    }

    @Override
    public double calculateTotal() {
        double total = 0;
        for (FoodItem item : getItems()) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public double calculateTotalWithTax() {
       double total = 0;
       for (FoodItem item : getItems()) {
           total += item.getPrice() + item.calculateTax();
       }

      DecimalFormat df = new DecimalFormat("#,##");
       df.setRoundingMode(RoundingMode.HALF_UP);
       return Double.parseDouble(df.format(total));
    }

    @Override
    public void displayItems() {
        System.out.println("Order ID: " + id);
        System.out.println("Date: " + dateTime);
        System.out.println("Items: ");
        for (FoodItem item : getItems()) {
            System.out.println(" " + item.getDescription());
        }
        System.out.println("Total order cost: " + calculateTotal() + " SEK");
        System.out.println("Total: " + calculateTotalWithTax() + " SEK");

    }
}
