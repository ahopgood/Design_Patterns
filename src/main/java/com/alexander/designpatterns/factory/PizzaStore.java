package com.alexander.designpatterns.factory;

public class PizzaStore {

    private SimplePizzaFactory factory = new SimplePizzaFactory();

    Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.box();
        return pizza;
    }

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();

        store.orderPizza("cheese");
    }
}
