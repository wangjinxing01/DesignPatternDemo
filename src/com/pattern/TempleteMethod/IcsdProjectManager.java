package com.pattern.TempleteMethod;

public class IcsdProjectManager extends ProjectManager {
    @Override
    public void doTask() {
        System.out.println("IcsdProjectManager. do task: ask other member to do tasks.");
        askOthersToDoTask();
    }

    @Override
    public void chooseMembers() {
        System.out.println("IcsdProjectManager. chooseMembers: more members, less capability.");
    }

    private void askOthersToDoTask() {
        System.out.println("do task.");
    }
}
