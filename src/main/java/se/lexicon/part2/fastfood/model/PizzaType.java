package se.lexicon.part2.fastfood.model;

public enum PizzaType {
    MARGHERITA("Margherita", 9.99),
    PEPPERONI("Pepperoni", 10.99),
    HAWAIIAN("Hawaiian", 11.99),
    SUPREME("Supreme", 12.99),
    BBQ_CHICKEN("BBQ Chicken", 13.99);

    private final String name;
    private final double price;

    PizzaType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
