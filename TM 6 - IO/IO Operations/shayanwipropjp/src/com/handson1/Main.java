package com.handson1;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name : ");
        String filename = sc.nextLine();
        System.out.print("Enter the character to be counted : ");
        char findchar = sc.nextLine().charAt(0);
        File file = new File(filename);
        int count = 0;
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        int ch;
        do {
            ch = buffer.read();

            if (ch >= 65 && ch <= 90) ch += 32;
            if (findchar >= 65 && findchar <= 90) {
                findchar += 32;
            }

            if (ch == findchar) {
                count++;
            }
        } while (ch != -1);

        System.out.println("File '" + filename + "' has " +count + " instances of letter '" + findchar + "'.");
    }

}
