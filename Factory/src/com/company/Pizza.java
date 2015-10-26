package com.company;

import java.util.ArrayList;

/**
 * Created by Shruti on 10/25/15.
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare()
    {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce....");
        System.out.println("Adding toppings:");
        for (int i=0; i < toppings.size(); i++)
            System.out.println("   " + toppings.get(i));
    }

    void bake(){
        System.out.println("Bake for 25 mins at 350 deg");
    }

    void cut(){
        System.out.println("Cut pizza into diagonal pieces");
    }

    void box(){
        System.out.println("Placing pizza into official pizza store box");
    }

    public String getName(){
        return name;
    }
}
