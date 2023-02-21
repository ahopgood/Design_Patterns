package com.alexander.designpatterns.factory.abstractfactory;

import com.alexander.designpatterns.factory.abstractfactory.ingredients.*;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.ny.FreshClams;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.ny.MarinaraSauce;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.ny.ReggianoCheese;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.ny.SlicedPepperoni;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.ny.ThinCrustDough;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.veggies.Garlic;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.veggies.Mushroom;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.veggies.Onion;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.veggies.RedPepper;

public class NYPizzaIngredientFactory extends PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = { new Garlic(), new Onion(), new Mushroom() , new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
