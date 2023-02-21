package com.alexander.designpatterns.factory.abstractfactory;

import com.alexander.designpatterns.factory.abstractfactory.ingredients.Cheese;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.Clams;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.Dough;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.Pepperoni;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.Sauce;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.Veggies;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.chicago.FrozenClams;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.chicago.MozzarellaCheese;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.chicago.PlumTomatoSauce;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.chicago.ThickCrustDough;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.ny.SlicedPepperoni;

public class ChicagoPizzaIngredientFactory extends PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
