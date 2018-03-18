package Zadanie1;

public class Zliczanie {
    public static void main(String[] args) {

        int counter = 0;
        char[] lliterki = args[0].toLowerCase().toCharArray();
        char sprawdzanaLitera = lliterki[0];

        for (int i = 1; i < args.length; i++) {
            char[] napis = args[i].toLowerCase().toCharArray();
            for (int j = 0; j < napis.length; j++) {
                if (napis[j] == sprawdzanaLitera)
                    counter++;
            }
        }

        System.out.printf("Literka '%c' powtórzyła się w napisie %d razy", sprawdzanaLitera, counter);

    }
}
