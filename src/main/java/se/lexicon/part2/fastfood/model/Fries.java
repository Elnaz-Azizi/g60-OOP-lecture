package se.lexicon.part2.fastfood.model;

public final class Fries extends FoodItem {

    private Size size;
    private boolean isSpicy;
    private boolean isSweetPotato;

    public Fries(Size size, boolean isSpicy, boolean isSweetPotato) {
        super(size.getPrice(), size.getLabel());
        this.size = size;
        this.isSpicy = isSpicy;
        this.isSweetPotato = isSweetPotato;
    }

    public Fries() {
        super(Size.S.getPrice(), Size.S.getLabel());
        this.size = Size.S;
        this.isSpicy = true;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Size: " + size + ", Spicy: " + isSpicy + ", Sweet Potato: " + isSweetPotato;
    }

    @Override
    public String toString() {
        return super.getName() + " ,Price: " + super.getPrice() + ", Size: " + size + ", Spicy: " + isSpicy + ", Sweet Potato: " + isSweetPotato;
    }
}
