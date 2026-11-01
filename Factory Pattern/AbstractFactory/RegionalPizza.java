package AbstractFactory;

import common.Pizza;

public class RegionalPizza extends Pizza {
    private final String cheese;
    private final String sauce;

    public RegionalPizza(String style, String cheese, String sauce) {
        super(style + " pizza with " + cheese + " and " + sauce + " sauce");
        this.cheese = cheese;
        this.sauce = sauce;
    }

    public String getCheese() {
        return cheese;
    }

    public String getSauce() {
        return sauce;
    }
}
