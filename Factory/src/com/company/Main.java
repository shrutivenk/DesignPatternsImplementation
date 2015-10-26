package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        PizzaStore nyStore = new NYPIzzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Shruti ordered a " + pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Suman ordered a " + pizza.getName());


    }

}
