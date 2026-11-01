package SimpleFactory;

import common.Pizza;

public class SimpleFactoryDemo {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        Pizza pizza = factory.createPizza("cheese");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
