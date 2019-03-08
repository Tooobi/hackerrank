package de.tooobi.hackerrank;

import java.util.Scanner;

public class Java_Loops_i {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", N, i, N * i));
        }
        scanner.close();
    }
}



