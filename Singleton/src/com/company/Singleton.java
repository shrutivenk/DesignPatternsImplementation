package com.company;

/**
 * Created by Shruti on 11/7/15.
 */
public class Singleton {

    private static volatile Singleton uniqueImplementation;

    private Singleton()
    {

    }

    public static Singleton getInstance()
    {
        if (uniqueImplementation == null)
            synchronized (Singleton.class){
                if (uniqueImplementation == null)
                    uniqueImplementation = new Singleton();
            }
        return uniqueImplementation;
    }
}
