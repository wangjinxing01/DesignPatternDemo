package com.observer;

public abstract class Observer {
    protected int source;
    public Observer() {
        setSource();
    }
    public abstract void setSource();
    public void response(DataBean data) {
        if (data.getSource() == source) {
            return;
        }
        response();
    }

    public abstract void response();
}
