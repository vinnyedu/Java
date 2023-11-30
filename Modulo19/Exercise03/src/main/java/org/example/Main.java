package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String path = "/tmp/in.txt";

        Map<String, Integer> votes = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);

                if (votes.containsKey(name)) {
                    int votesCounted = votes.get(name);
                    votes.put(name, count + votesCounted);
                } else {
                    votes.put(name, count);
                }

                line = br.readLine();
            }

            for (String key : votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
