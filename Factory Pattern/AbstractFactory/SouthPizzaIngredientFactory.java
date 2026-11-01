package AbstractFactory;

public class SouthPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public String cheese() {
        return "mozzarella";
    }

    @Override
    public String sauce() {
        return "spicy tomato";
    }
}
