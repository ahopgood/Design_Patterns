package com.alexander.designpatterns.factory.abstractfactory;

import com.alexander.designpatterns.factory.abstractfactory.ingredients.Cheese;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.Clams;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.Dough;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.Pepperoni;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.Sauce;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.Veggies;

public abstract class PizzaIngredientFactory {
    public abstract Dough createDough();
    public abstract Sauce createSauce();
    public abstract Cheese createCheese();
    public abstract Veggies[] createVeggies();
    public abstract Pepperoni createPepperoni();
    public abstract Clams createClams();
}
