package com.observer;

public class SystemObserver extends Observer {
    @Override
    public void response() {
        System.out.println("System Diag need to do sth...");
    }

    @Override
    public void setSource() {
        this.source = 100;
    }
}
