package com.pattern.TempleteMethod;

public class SegProjectManager extends ProjectManager {
    @Override
    public void doTask() {
        System.out.println("SegProjectManager. do task: do the task by myself.");
    }

    @Override
    public void chooseMembers() {
        System.out.println("SegProjectManager. chooseMembers: less members, more capability.");
    }
}

