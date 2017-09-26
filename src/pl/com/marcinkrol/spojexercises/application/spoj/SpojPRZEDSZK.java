package pl.com.marcinkrol.spojexercises.application.spoj;

import java.util.Scanner;

public class SpojPRZEDSZK {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int countTest = sc.nextInt();

        for (int i = 0; i < countTest; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(nww(x, y));
        }
    }

    private static int nww(int x, int y) {
        return ((x * y) / nwd(x, y));
    }

    private static int nwd(int x, int y) {
        while (x != y) {
            if (x > y) {
                x -= y;
            } else {
                y -= x;
            }
        }
        return x;
    }

}
