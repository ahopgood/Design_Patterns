package com.alexander.designpatterns.factory.method;

import com.alexander.designpatterns.factory.CheesePizza;
import com.alexander.designpatterns.factory.ClamPizza;
import com.alexander.designpatterns.factory.PepperoniPizza;
import com.alexander.designpatterns.factory.Pizza;
import com.alexander.designpatterns.factory.PizzaStore;
import com.alexander.designpatterns.factory.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
