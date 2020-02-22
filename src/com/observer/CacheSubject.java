package com.observer;

import javax.xml.crypto.Data;

public class CacheSubject extends Subject{
    @Override
    public void notifyObserver(DataBean data) {
        if (observers == null || observers.isEmpty()) {
            return;
        }
        for (Observer observer:observers) {
            observer.response(data);
        }
    }
}
