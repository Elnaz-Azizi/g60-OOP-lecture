package se.lexicon.part2.fastfood.model;

public enum Size {
    S( "Small", 15),
    M( "Medium", 20),
    L( "Large", 25);

    private final String label;
    private final double price;

    Size(String label, double price) {
        this.label = label;
        this.price = price;
    }

    public String getLabel() {
        return label;
    }

    public double getPrice() {
        return price;
    }
}
