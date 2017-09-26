package pl.com.marcinkrol.spojexercises.application.spoj;

import java.util.Scanner;

public class SpojPA05_POT {

    public static void main(String[] args) {

        int[][] tab = new int[][]{
                {0, 0, 0, 0},
                {1, 1, 1, 1},
                {6, 2, 4, 8},
                {1, 3, 9, 7},
                {6, 4, 6, 4},
                {5, 5, 5, 5},
                {6, 6, 6, 6},
                {1, 7, 9, 3},
                {6, 8, 4, 2},
                {1, 9, 1, 9}
        };

        long a, b;
        int count;
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            a = sc.nextLong();
            b = sc.nextLong();

            System.out.println(tab[(int) a % 10][(int) b % 4]);
        }
    }

}
