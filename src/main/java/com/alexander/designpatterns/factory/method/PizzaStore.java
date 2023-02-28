package com.alexander.designpatterns.factory.method;

public abstract class PizzaStore {

    Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);

    public static void main(String[] args) {
        PizzaStore store = new ChicagoPizzaStore();

        store.orderPizza("cheese");
    }
}
