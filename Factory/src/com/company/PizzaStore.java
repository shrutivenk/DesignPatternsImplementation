package com.company;

/**
 * Created by Shruti on 10/25/15.
 */
public abstract class PizzaStore {

    public Pizza orderPizza( String type)
    {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type); // a factory method handles object creation and encapsulates it in a subclass
    //This decouples the client code in the superclass from the object creation code in the subclass

}
