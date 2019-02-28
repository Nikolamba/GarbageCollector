package ru.job4j.softreferences;

import java.util.Scanner;

/**
 * @author Nikolay Meleshkin (sol.of.f@mail.ru)
 * @version 0.1
 */
public class StartApp {

    public static void main(String[] args) {
        Cache cache = new Cache();
        Scanner scanner = new Scanner(System.in);
        String line;
        do {
            System.out.println("Enter file name or 'exit': ");
            line = scanner.nextLine();
            if (!line.equalsIgnoreCase("exit")) {
                System.out.println(cache.getSource(line));
            }
        } while (!line.equalsIgnoreCase("exit"));
    }
}
