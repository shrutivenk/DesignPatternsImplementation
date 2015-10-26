package com.company;

/**
 * Created by Shruti on 10/25/15.
 */
public class NYPIzzaStore extends PizzaStore {

protected Pizza createPizza(String item)
{
    if (item.equals("cheese"))
        return new NYStyleCheesePizza();
    else if (item.equals("clam"))
        return new NYStyleClamPizza();
    else return null;
}



}




