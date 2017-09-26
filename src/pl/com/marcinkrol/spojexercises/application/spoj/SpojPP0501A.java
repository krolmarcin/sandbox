package pl.com.marcinkrol.spojexercises.application.spoj;

import java.util.Scanner;

public class SpojPP0501A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int countTest = sc.nextInt();

        for (int i = 0; i < countTest; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(nwd(a, b));
        }
    }

    private static int nwd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

}
