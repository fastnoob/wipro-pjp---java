package com.handson3;

import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input file name : ");
        String input = sc.nextLine();
        System.out.print("Enter the output file name : ");
        String output = sc.nextLine();
        File inputFile = new File(input);
        File outputFile = new File(output);
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
        Map<String, Integer> map = new TreeMap<>();
        String str;
        while ((str = br.readLine()) != null) {
            str = str.trim();
            String[] words = str.split(" ");
            for (String word : words) {
                if (!map.containsKey(word)) {
                    map.put(word, 1);
                }
                else {
                    map.put(word, map.get(word) + 1);
                }
            }
        };
        Set<Entry<String, Integer>> set = map.entrySet();
        Iterator<Entry<String, Integer>> it = set.iterator();
        while(it.hasNext()) {
            Entry<String, Integer> me = it.next();
            bw.write(me.getKey() + " : " + me.getValue() + "\n");
        }
        br.close();
        bw.close();
        sc.close();
        System.out.println("WORK DONE");
    }
}
