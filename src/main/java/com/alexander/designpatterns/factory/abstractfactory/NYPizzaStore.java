package com.alexander.designpatterns.factory.abstractfactory;

import com.alexander.designpatterns.factory.abstractfactory.pizzas.CheesePizza;
import com.alexander.designpatterns.factory.abstractfactory.pizzas.ClamPizza;
import com.alexander.designpatterns.factory.abstractfactory.pizzas.PepperoniPizza;
import com.alexander.designpatterns.factory.abstractfactory.pizzas.Pizza;
import com.alexander.designpatterns.factory.abstractfactory.pizzas.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }
        return pizza;
    }
}
