package com.pattern.TempleteMethod;

public abstract class ProjectManager {
    public abstract void doTask();
    public abstract void chooseMembers();
    public final void report() {
        System.out.println("Report func.");
    }
}
