package com.company;

/**
 * Created by Shruti on 9/27/15.
 */
public class SteamedMilk extends ACondimentDecorator
{
    ABeverage beverage;

    public SteamedMilk(ABeverage beverage)
    {
        this.beverage = beverage;
    }

    public String getDescription()
    {
        return beverage.getDescription() + ", Steamed Milk";
    }

    public double cost()
    {
        return beverage.cost() + .10;
    }
}
