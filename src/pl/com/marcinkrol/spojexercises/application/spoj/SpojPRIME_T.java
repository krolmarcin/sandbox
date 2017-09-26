package pl.com.marcinkrol.spojexercises.application.spoj;

import java.util.Scanner;

public class SpojPRIME_T {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int a = sc.nextInt();
            if (isPrime(a))
                System.out.println("TAK");
            else
                System.out.println("NIE");
        }
    }

    private static boolean isPrime(int a) {
        if (a <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

}
