package com.company;

import com.pattern.*;
import com.pattern.TempleteMethod.*;
import com.util.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        testSingleTon();
        testTempleteMethod();
    }

    private static void testTempleteMethod() {
        ProjectManager icsdProjMgr = new IcsdProjectManager();
        ProjectManager segProjMgr = new SegProjectManager();
        icsdProjMgr.doTask();
        icsdProjMgr.chooseMembers();
        icsdProjMgr.report();

        segProjMgr.doTask();
        segProjMgr.chooseMembers();
        segProjMgr.report();
    }

    private static void testSingleTon() {
        ArrayList<MultiThread> multiThreads = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            multiThreads.add(new MultiThread("com.pattern.SingleTon", "getInstance"));
        }
        for (MultiThread multithread : multiThreads) {
            multithread.start();
        }
    }
}
