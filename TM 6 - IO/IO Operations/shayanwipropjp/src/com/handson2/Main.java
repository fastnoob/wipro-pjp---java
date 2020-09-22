package com.handson2;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input file name : ");
        String file1=sc.nextLine();
        System.out.print("Enter the outpur file name : ");
        String file2=sc.nextLine();
        FileReader fr = new FileReader(file1);
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter(file2, true);
        String str;
        while ((str = br.readLine()) != null) {
            fw.write(str);
            fw.flush();
        }
        br.close();
        fw.close();
        System.out.println("File copied");
    }
}