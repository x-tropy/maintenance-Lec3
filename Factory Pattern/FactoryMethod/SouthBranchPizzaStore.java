package FactoryMethod;

import common.CheesePizza;
import common.PepperoniPizza;
import common.Pizza;

public class SouthBranchPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if ("pepperoni".equalsIgnoreCase(type)) {
            return new PepperoniPizza();
        }
        if ("cheese".equalsIgnoreCase(type)) {
            return new CheesePizza();
        }
        throw new IllegalArgumentException("South branch does not make: " + type);
    }
}
