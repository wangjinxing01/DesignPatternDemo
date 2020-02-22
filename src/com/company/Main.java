package com.company;

import com.observer.*;
import com.pattern.*;
import com.pattern.TempleteMethod.*;
import com.pattern.factoryMethod.BuildingModelFactory;
import com.pattern.factoryMethod.DeviceFactory;
import com.pattern.factoryMethod.Factory;
import com.pattern.factoryMethod.Product;
import com.pattern.strategy.LinkCalculation;
import com.util.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        testSingleTon();
        testTempleteMethod();
        testFactoryMethod();
        testStrategy();
        testObserver();
    }

    private static void testObserver() {
        Subject cacheSubject = new CacheSubject();
        Observer planeObserver = new PlaneObserver();
        Observer systemObserver = new SystemObserver();
        Observer elevatorObserver = new ElevatorObserver();

        cacheSubject.addObserver(planeObserver);
        cacheSubject.addObserver(systemObserver);
        cacheSubject.addObserver(elevatorObserver);

        DataBean data = new DataBean();
        data.setSource(100);
        data.setData(50000);
        cacheSubject.notifyObserver(data);
    }


    private static void testFactoryMethod() {
        List<Factory> factories = new LinkedList<>();
        factories.add(new BuildingModelFactory());
        factories.add(new DeviceFactory());
        for (Factory factory:factories) {
            Product product = factory.create();
            product.draw();
            product.saveToDB();
        }

    }

    private static void testStrategy() {
        LinkCalculation linkCalculation = new LinkCalculation("Ethernet:FibrePort:FibrePort:Ethernet");
        linkCalculation.getLinkCalculation();
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
