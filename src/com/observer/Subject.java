package com.observer;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Subject {
    protected List<Observer> observers = new LinkedList<>();


    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers = observers.stream()
                .filter(obs -> !observer.equals(obs))
                .collect(Collectors.toList());
    }

    public abstract void notifyObserver(DataBean data);

    public void addData(DataBean data) {
        notifyObserver(data);
    }
}
