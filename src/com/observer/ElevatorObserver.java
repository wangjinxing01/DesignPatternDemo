package com.observer;

public class ElevatorObserver extends Observer {
    @Override
    public void response() {
        System.out.println("Elevator Diag need to do sth...");
    }

    @Override
    public void setSource() {
        this.source = 200;
    }
}
