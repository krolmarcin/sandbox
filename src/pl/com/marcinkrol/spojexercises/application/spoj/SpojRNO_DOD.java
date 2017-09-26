package pl.com.marcinkrol.spojexercises.application.spoj;

import java.util.Scanner;

public class SpojRNO_DOD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCount = sc.nextInt();

        for (int i = 0; i < testCount; i++) {
            int sumCount = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < sumCount; j++) {
                sum += sc.nextInt();
            }
            System.out.println(sum);
        }
    }

}
