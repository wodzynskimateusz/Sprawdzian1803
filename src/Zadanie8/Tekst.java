package Zadanie8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Tekst {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("E:\\SDA\\Sprawdzian1803\\src\\Zadanie8\\Tekst.txt");
        Scanner sc = new Scanner(file);

        int liczbaWyrazow = 0;
        int nrZdania = 1;
        HashMap<Integer, Integer> zliczanie = new HashMap<>();

        while (sc.hasNextLine()){
            String line1 = sc.nextLine();
            String[] wyrazy = line1.split(" ");
            for (int i = 0; i <wyrazy.length ; i++) {
                if (wyrazy[i].contains(".") || wyrazy[i].contains(";") || wyrazy[i].contains("?") || wyrazy[i].contains("!")){
                    liczbaWyrazow++;
                    zliczanie.put(nrZdania,liczbaWyrazow);
                    liczbaWyrazow = 0;
                    nrZdania++;
                } else {
                    liczbaWyrazow++;
                }
            }
        }

        for (Integer i : zliczanie.keySet()) {
            int wyrazy = zliczanie.get(i);
            System.out.printf("Zdanie nr %d sklada sie z %d wyrazow.\n", i, wyrazy);
        }

    }
}
