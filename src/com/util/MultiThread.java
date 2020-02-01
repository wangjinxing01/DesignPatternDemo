package com.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import com.pattern.SingleTon;

public class MultiThread extends Thread {
    private String className;
    private String methodName;

    public MultiThread(String className, String methodName) {
        this.className = className;
        this.methodName = methodName;
    }

    @Override
    public void run() {
        try {
            Class classz = Class.forName(className);
            Method method = classz.getMethod(methodName);
            //Object object = classz.newInstance(); // 通过反射调用静态方法，传入object为null。
            for (int i = 0; i < 10; i++) {
                method.invoke(null);
            }
        } catch (Exception e) {
            System.out.println("MultiThread::run. error. " + e.getMessage());
        }
    }
}
