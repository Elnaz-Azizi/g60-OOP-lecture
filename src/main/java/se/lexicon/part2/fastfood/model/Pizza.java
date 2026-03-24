package se.lexicon.part2.fastfood.model;

public class Pizza extends FoodItem {

    private PizzaType type; // Type of pizza

    public Pizza(PizzaType type) {
        super(type.getPrice(), type.getName()); // Set the name and price based on the pizza type
        this.type = type;
    }

    // Getters and setters for fields

    public PizzaType getType() {
        return type;
    }

    public void setType(PizzaType type) {
        this.type = type;
    }


    // Method to calculate taxes for the pizza
    @Override
    public double calculateTax() {
        // Assume a tax rate of 8%
        return getPrice() * 0.08;
    }

    @Override
    public String toString() {
        return "{" +
                " name=" + getName() +
                ", price=" + getPrice() +
                ", type=" + type +
                "}";
    }


    // Method to display the pizza's information
    @Override
    public String getDescription() {
        return super.getDescription() + ", Pizza: " + getName() + ", Type: " + type.getName();
    }


}
