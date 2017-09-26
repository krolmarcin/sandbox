package pl.com.marcinkrol.spojexercises.application.spoj;

import java.util.Scanner;

public class SpojBNF1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int countTest = sc.nextInt();


        for (int i = 0; i < countTest; i++) {
            int input = sc.nextInt();
            int sumCounter = 0;

            while (!isPalindrome(input)) {
                input += getReverseInt(input);
                sumCounter++;
            }
            System.out.println(input + " " + sumCounter);
        }
    }

    private static int getReverseInt(int input) {
        int reversedInt = 0;
        while (input > 0) {
            int lastDigit = input % 10;
            input = input / 10;
            reversedInt = reversedInt * 10 + lastDigit;
        }
        return reversedInt;

    }

    private static boolean isPalindrome(int input) {
        String temp = Integer.toString(input);
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(0) != temp.charAt(temp.length() - 1)) {
                return false;
            }
        }
        return true;
    }

}
