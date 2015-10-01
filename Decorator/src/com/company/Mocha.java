package com.company;

/**
 * Created by Shruti on 9/27/15.
 */
public class Mocha extends ACondimentDecorator
{
    ABeverage beverage;

    public Mocha(ABeverage beverage)
    {
        this.beverage = beverage;
    }

    public String getDescription()
    {
        return beverage.getDescription() + ", Mocha";
    }

    public Size getSize()
    {
        return beverage.getSize();
    }

    public double cost()
    {
        return beverage.cost() + .20;
    }
}
