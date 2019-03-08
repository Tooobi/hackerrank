package de.tooobi.hackerrank;

import java.util.Scanner;

public class Java_Loops {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        System.out.println(String.format("Start with %d", t));
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int result = a;
            for (int j = 0; j < n; j++) {
                result += Math.pow(2, j) * b;
                System.out.print(String.format("%d ", result));
            }
            System.out.println();
        }
        in.close();
    }
}
