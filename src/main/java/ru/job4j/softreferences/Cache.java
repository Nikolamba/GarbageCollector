package ru.job4j.softreferences;

import java.io.*;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Nikolay Meleshkin (sol.of.f@mail.ru)
 * @version 0.1
 */
public class Cache {
    private final Map<String, SoftReference<String>> cachaMap;

    public Cache() {
        this.cachaMap = new HashMap<>();
    }

    public String getSource(String fileName) {
        if (this.cachaMap.get(fileName) == null
                || this.cachaMap.get(fileName).get() == null) {
            SoftReference<String> reference = new SoftReference<>(getFile(fileName));
            cachaMap.put(fileName, reference);
        }
        return cachaMap.get(fileName).get();
    }

    private String getFile(String fileName) {
        StringBuilder  stringBuilder = new StringBuilder();
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
