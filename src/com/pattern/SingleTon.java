package com.pattern;

/***
public class SingleTon {
    public static SingleTon instance = new SingleTon();
    private SingleTon() {
        System.out.println("Singleton class constructor.");
    }

    public static SingleTon getInstance() {
        return instance;
    }
}
 ***/

public class SingleTon {
    private static SingleTon instance;
    private SingleTon() {
        System.out.println("Singleton class constructor.");
    }

    public static SingleTon getInstance() {
        if (instance == null) {
            synchronized (SingleTon.class) {
                if (instance == null) {
                    instance = new SingleTon();
                }
            }
        }
        return instance;
    }
}
