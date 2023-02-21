package com.alexander.designpatterns.factory.abstractfactory.pizzas;

import com.alexander.designpatterns.factory.abstractfactory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        super.name = "Clam";
    }

    @Override
    public void prepare() {
        log.info("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClams();

    }
}
