package Zadanie7;

public class Rekurencja {
    public static void main(String[] args) {

        String input = "Hello World!";
        System.out.println(rev(input));
    }

    public static String rev(String str) {
        if (str.length() < 2)
            return str;
        return rev(str.substring(1)) + str.charAt(0);
    }
}
