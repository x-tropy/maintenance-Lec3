package FactoryMethod;

import common.CheesePizza;
import common.Pizza;
import common.VeggiePizza;

public class NorthBranchPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equalsIgnoreCase(type)) {
            return new CheesePizza();
        }
        if ("veggie".equalsIgnoreCase(type)) {
            return new VeggiePizza();
        }
        throw new IllegalArgumentException("North branch does not make: " + type);
    }
}
