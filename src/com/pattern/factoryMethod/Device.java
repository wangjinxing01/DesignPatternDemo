package com.pattern.factoryMethod;

public class Device extends Product {
    @Override
    public void draw() {
        System.out.println("Device::draw. draw a device in UI.");
    }

    @Override
    public void saveToDB() {
        System.out.println("Device::saveToDB. save info into device's tables.");
    }
}
