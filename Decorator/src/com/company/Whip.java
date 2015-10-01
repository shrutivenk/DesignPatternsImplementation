package com.company;

/**
 * Created by Shruti on 9/27/15.
 */
public class Whip extends ACondimentDecorator
{
    ABeverage beverage;

    public Whip(ABeverage beverage)
    {
        this.beverage = beverage;
    }

    public String getDescription()
    {
        return beverage.getDescription() + ", Whip";
    }

    public double cost()
    {
        return beverage.cost() + .10;
    }
}
