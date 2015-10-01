package com.company;

/**
 * Created by Shruti on 9/27/15.
 */
public abstract class ABeverage {

    public enum Size { TALL, GRANDE, VENTI};

    String description = "Unknown Beverage";
    Size size;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void setSize(Size size)
    {
        this.size = size;
    }

    public Size getSize()
    {
        return size;
    }
}
