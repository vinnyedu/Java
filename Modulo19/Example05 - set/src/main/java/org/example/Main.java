package org.example;


import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // HashSet - fast and unordered
        // TreeSet - slow and ordered
        // LinkedHashSet - average and insertion-ordered
        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");
        set.add("IPhone");

        set.removeIf(s -> s.charAt(0) == 'T');

        System.out.println(set.contains("Notebook"));
        System.out.println();

        for (String p : set) {
            System.out.println(p);
        }
    }
}