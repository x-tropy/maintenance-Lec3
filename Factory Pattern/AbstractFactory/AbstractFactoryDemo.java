package AbstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactoryPizzaStore north =
                new AbstractFactoryPizzaStore(new NorthPizzaIngredientFactory());
        AbstractFactoryPizzaStore south =
                new AbstractFactoryPizzaStore(new SouthPizzaIngredientFactory());

        north.orderPizza("cheese");
        south.orderPizza("cheese");
    }
}
