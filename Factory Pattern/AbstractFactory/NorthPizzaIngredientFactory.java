package AbstractFactory;

public class NorthPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public String cheese() {
        return "sharp cheddar";
    }

    @Override
    public String sauce() {
        return "tomato";
    }
}
