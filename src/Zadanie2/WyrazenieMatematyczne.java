package Zadanie2;

import java.util.Scanner;
import java.util.Stack;

public class WyrazenieMatematyczne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Character> stos = new Stack<>();

        System.out.println("Podaj wyrażenie matematyczne, które chcesz sprawdzić");
        String input = sc.nextLine();

        char[] array = input.toCharArray();

        try {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == '(')
                    stos.push(array[i]);
                if (array[i] == ')')
                    stos.pop();
            }
            if (stos.isEmpty()) {
                System.out.println("Poprawne sparowanie nawiasów");
            } else {
                System.out.println("Błędne sparowanie nawiasów");
            }

        } catch (Exception e) {
            System.out.println("Błędne sparowanie nawiasów");
        }

    }
}
