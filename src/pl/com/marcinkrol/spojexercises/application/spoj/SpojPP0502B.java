package pl.com.marcinkrol.spojexercises.application.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpojPP0502B {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int countTest = Integer.parseInt(reader.readLine());

        for (int i = 0; i < countTest; i++) {
            String line = reader.readLine();
            String[] tab = line.split(" ");

            for (int j = tab.length - 1; j > 0; j--) {
                System.out.print(tab[j] + " ");
            }
            System.out.println("");
        }
    }
}

