package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new FileInputStream("file1.txt"));
        Scanner sc2 = new Scanner(new FileInputStream("file2.txt"));
        PrintWriter pw = new PrintWriter(new FileOutputStream("output.txt"));
        int x = sc1.nextInt(),y = sc2.nextInt();
        while (sc1.hasNextInt() & sc2.hasNextInt()) {
            if (x < y) {
                pw.println(x);
                x = sc1.nextInt();
            } else {
                pw.println(y);
                y = sc2.nextInt();
            }
        }

        if (!sc1.hasNextInt()) {
           while (x>y) {
               if (!sc2.hasNextInt()){
                   pw.println(y);
                   y = sc2.nextInt();
               }
               else {
                   pw.println(y);
                   y = x;
               }
           }
            pw.println(x);
           while(sc2.hasNextInt()) {
               pw.println(y);
               y = sc2.nextInt();
           }
            pw.println(y);
        }
        else {
            if (!sc2.hasNextInt()) {
                while (y > x) {
                    if (sc1.hasNextInt()){
                        pw.println(x);
                        x = sc1.nextInt();
                    }
                    else {
                        pw.println(x);
                        x = y;
                    }
                }
                pw.println(y);
                while (sc1.hasNextInt()) {
                    pw.println(x);
                    x = sc1.nextInt();
                }
            }
        }
        pw.close();
    }
}
