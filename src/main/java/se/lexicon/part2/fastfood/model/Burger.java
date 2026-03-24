package se.lexicon.part2.fastfood.model;

public final class Burger extends FoodItem{

    private final String type; // eg. Cheeseburger, Bacon Cheeseburger, etc.
    private final boolean hasCheese;
    private final boolean hasLettuce;

    public Burger(double price, String name, String type, boolean hasCheese, boolean hasLettuce) {
        super(price, name);
        this.type = type;
        this.hasCheese = hasCheese;
        this.hasLettuce = hasLettuce;
    }

    @Override
    public String getDescription() {
        return "Item: " + super.getName() + " ,Price: " + super.getPrice() + ", Type: " + type + ", Cheese: " + hasCheese + ", Lettuce: " + hasLettuce;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.1; // 10% tax
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: " + type + ", Cheese: " + hasCheese + ", Lettuce: " + hasLettuce;
    }


}
