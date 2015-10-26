package com.company;

/**
 * Created by Shruti on 10/25/15.
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza()
    {
        name = "Chicago style sauce and cheese pizza";
        dough = "Extra thick crust dough";
        sauce = "Plum tomato sauce";

        toppings.add("Shredded Mozarella Cheese");
    }

    void cut()
    {
        System.out.println("Cut pizza into square slices");
    }
}
