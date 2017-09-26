package pl.com.marcinkrol.spojexercises.application.spoj;

import java.util.Scanner;

public class SojFLAMASTE {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String value, output;
        char prev, curr = ' ';
        int i, j, l;
        int count = sc.nextInt();

        for (i = 0; i < count; i++) {
            value = sc.next();
            output = "";

            if (value.length() == 1) {
                curr = value.charAt(0);
            }
            for (j = l = 1; j < value.length(); ++j) {
                prev = value.charAt(j - 1);
                curr = value.charAt(j);

                if (prev == curr) {
                    ++l;
                } else {
                    output += build(String.valueOf(prev), l);
                    l = 1;
                }
            }
            output += build(String.valueOf(curr), l);
            System.out.println(output);
        }
    }

    private static String build(String prev, int l) {
        if (l == 1) {
            return prev;
        } else if (l == 2) {
            return prev + prev;
        } else {
            return prev + String.valueOf(l);
        }
    }

}
