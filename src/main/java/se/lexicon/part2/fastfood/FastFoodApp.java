package se.lexicon.part2.fastfood;

import se.lexicon.part2.fastfood.model.Burger;
import se.lexicon.part2.fastfood.model.FoodItem;
import se.lexicon.part2.fastfood.model.Fries;
import se.lexicon.part2.fastfood.model.Size;

public class FastFoodApp {
    static void main() {
        FoodItem burger = new Burger(12.99, "Cheeseburger", "Cheeseburger", true, true);
        System.out.println(burger.getDescription());
        System.out.println("Tax: SEK " + burger.calculateTax());
        System.out.println(burger.toString());

        System.out.println("--------------------------------");

        FoodItem largeFries = new Fries(Size.L, true, true);
        FoodItem smallFries = new Fries();

        System.out.println(largeFries.getDescription());
        System.out.println("Tax: SEK " + largeFries.calculateTax());

        System.out.println(smallFries.getDescription());
        System.out.println("Tax: SEK " + smallFries.calculateTax());
    }
}
