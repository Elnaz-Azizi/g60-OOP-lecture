package se.lexicon.part2.fastfood.model;

import java.util.List;

public interface IOrderItem {

    public abstract void addItem(FoodItem item);
    void removeItem(FoodItem item);
    List<FoodItem> getItems();
    double calculateTotal();
    double calculateTotalWithTax();
    void displayItems();
}
