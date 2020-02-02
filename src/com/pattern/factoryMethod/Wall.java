package com.pattern.factoryMethod;

public class Wall extends Product {
    @Override
    public void draw() {
        System.out.println("Wall::draw. draw a wall in UI.");
    }

    @Override
    public void saveToDB() {
        System.out.println("Wall::saveToDB. save info into wall's tables.");
    }
}