package FactoryMethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        PizzaStore north = new NorthBranchPizzaStore();
        PizzaStore south = new SouthBranchPizzaStore();

        north.orderPizza("cheese");
        south.orderPizza("pepperoni");
    }
}
