package ru.job4j.demonstration;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * @author Nikolay Meleshkin (sol.of.f@mail.ru)
 * @version 0.1
 */
public class StartApp {

    public static void main(String[] args) {
        long startTime = new GregorianCalendar().getTimeInMillis();
        StartApp start = new StartApp();
        for (int j = 0; j < 20; j++) {
           start.testMethod();
        }
        long finishTime = new GregorianCalendar().getTimeInMillis();
        System.out.println("Working time: " + (finishTime - startTime) + " ms");
    }

    public void testMethod() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            users.add(new User());
        }
        info();
    }

    public void info() {
        int kb = 1024;
        Runtime runtime = Runtime.getRuntime();
//        System.out.println("Used memory: " + (runtime.totalMemory() - runtime.freeMemory()) / kb);
//        System.out.println("Total memory: " + runtime.totalMemory() / kb);
        System.out.println("Free memory: " + runtime.freeMemory() / kb);
    }
}
