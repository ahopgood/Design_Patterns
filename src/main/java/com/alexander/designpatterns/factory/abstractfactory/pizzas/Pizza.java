package com.alexander.designpatterns.factory.abstractfactory.pizzas;

import com.alexander.designpatterns.factory.abstractfactory.ingredients.Cheese;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.Clams;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.Dough;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.Pepperoni;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.Sauce;
import com.alexander.designpatterns.factory.abstractfactory.ingredients.Veggies;
import org.apache.log4j.Logger;

public abstract class Pizza {

    protected Logger log = Logger.getLogger(Pizza.class.getName());
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    public abstract void prepare();

    public void bake(){
        log.info("Bake for 25 minutes at 350");
    }

    public void cut(){
        log.info("Cutting the pizza into diagonal slices");
    }

    public void box(){
        log.info("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
