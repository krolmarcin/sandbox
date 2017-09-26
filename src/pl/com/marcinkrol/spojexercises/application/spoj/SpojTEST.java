package pl.com.marcinkrol.spojexercises.application.spoj;

import java.util.Scanner;

public class SpojTEST {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            if (a == 42) {
                break;
            }
            System.out.println(a);
        }
    }
}