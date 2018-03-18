package Zadanie3;

import java.util.Random;
import java.util.Scanner;

public class Losowanie {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Ile liczb chcesz wylosować?");
        int number = sc.nextInt();

        if (number > 0) {

            int value = 0;
            int max = -1000;
            int min = 1000;
            int aboveZero = 0;
            int belowZero = 0;

            System.out.println("Wylosowane liczby:");
            for (int i = 0; i < number; i++) {
                value = rand.nextInt(201) - 100;
                if (value > 0)
                    aboveZero++;
                if (value < 0)
                    belowZero++;
                if (value > max)
                    max = value;
                if (value < min)
                    min = value;
                System.out.print(value + "  ");
            }

            System.out.println();
            System.out.printf("Stosunek liczb dodatnich do ujemnych to  %d:%d.\n" +
                            "Najwieksza wylosowana liczba to %d.\n" +
                            "Najmniejsza wylosowana liczba to %d.",
                    aboveZero, belowZero, max, min);
        } else {
            System.out.println("Wprowadziłeś błędne dane.");
        }
    }
}
