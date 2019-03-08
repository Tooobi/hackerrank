package de.tooobi.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SummingTheNSeries {

    private static final Scanner scanner = new Scanner(System.in);

    static int summmu(long n) {
        return (int) (n * n);
    }

    /*
     * Complete the summingSeries function below.
     */
    static int summingSeries(long n) {
        /*
         * Write your code here.
         */
        long result = 0;

        int i = 0;
        while (i < n) {
            result += getSeriesValue(n);
            n--;
        }
        return (int) result;
    }

    private static long getSeriesValue(long n) {
//        return Math.pow(n, 2) - Math.pow(n-1, 2);
        return (n * n) - ((n - 1) * (n - 1));
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            long n = Long.parseLong(scanner.nextLine().trim());

//            int result = summingSeries(n);
            int result = summmu(n);

            System.out.println("Result = [" + result + "]");
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}

