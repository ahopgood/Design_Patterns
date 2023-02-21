package com.alexander.designpatterns.factory.abstractfactory;

import com.alexander.designpatterns.factory.abstractfactory.pizzas.Pizza;

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
        PizzaStore store = new NYPizzaStore();

        store.orderPizza("cheese");
    }
}
