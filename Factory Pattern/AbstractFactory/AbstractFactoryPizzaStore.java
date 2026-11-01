package AbstractFactory;

import common.Pizza;

public class AbstractFactoryPizzaStore {
    private final PizzaIngredientFactory ingredientFactory;

    public AbstractFactoryPizzaStore(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public Pizza orderPizza(String type) {
        if (!"cheese".equalsIgnoreCase(type)) {
            throw new IllegalArgumentException("Unknown pizza type: " + type);
        }

        Pizza pizza = new RegionalPizza(
                type, ingredientFactory.cheese(), ingredientFactory.sauce());
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
