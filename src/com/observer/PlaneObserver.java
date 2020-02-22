package com.observer;

public class PlaneObserver extends Observer {
    @Override
    public void response() {
        System.out.println("Plane Diag need to do sth...");
    }

    @Override
    public void setSource() {
        this.source = 001;
    }
}
