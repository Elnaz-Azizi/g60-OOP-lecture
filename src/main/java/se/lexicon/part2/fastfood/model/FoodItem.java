package se.lexicon.part2.fastfood.model;

public abstract class FoodItem {

    private String name;
    private final double price;

    public FoodItem(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return "Item: " + name + ", Price: " + price + " SEK";
    }

    public abstract double calculateTax();


    @Override
    public String toString() {
        return "FoodItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


