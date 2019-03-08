package de.tooobi.hackerrank;

import java.util.Scanner;


public class Java_IfElse {

    private static final Scanner scanner = new Scanner(System.in);
    private static String WEIRD = "Weird";
    private static String NOT_WEIRD = "Not Weird";

    public static void main(String[] args) {

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        String result = checkIfValueIsOddOrEven(N);
        System.out.println(result);
    }

    private static String checkIfValueIsOddOrEven(int valueToCheck) {
        if ((valueToCheck % 2) == 0 && ((valueToCheck >= 2 && valueToCheck <= 5) || valueToCheck > 20)) {
            return NOT_WEIRD;
        }
//        if ((valueToCheck % 2) == 1) {
//            return WEIRD;
//        } else {
//            if (valueToCheck >= 2 && valueToCheck <= 5) {
//                return NOT_WEIRD;
//            } else if (valueToCheck >= 6 && valueToCheck <= 20) {
//                return WEIRD;
//            } else if (valueToCheck > 20) {
//                return NOT_WEIRD;
//            }
//        }
        return WEIRD;
    }
}
