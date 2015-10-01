package com.company;

public class Main {

    public static void main(String[] args)
    {
	    ABeverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() +" $" + beverage1.cost());

        ABeverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new SteamedMilk(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        ABeverage beverage3 = new HouseBlend();
        beverage3 = new Mocha(beverage3);
        beverage3 = new SteamedMilk(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

    }
}
