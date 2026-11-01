package SimpleFactory;

import common.CheesePizza;
import common.PepperoniPizza;
import common.Pizza;
import common.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        if ("cheese".equalsIgnoreCase(type)) {
            return new CheesePizza();
        }
        if ("pepperoni".equalsIgnoreCase(type)) {
            return new PepperoniPizza();
        }
        if ("veggie".equalsIgnoreCase(type)) {
            return new VeggiePizza();
        }
        throw new IllegalArgumentException("Unknown pizza type: " + type);
    }
}
