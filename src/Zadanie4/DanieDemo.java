package Zadanie4;

import Zadanie4.Dodatki.Frytki;
import Zadanie4.Dodatki.Kompot;
import Zadanie4.Dodatki.Surowka;
import Zadanie4.SkladnikiPodstawowe.Schabowy;

public class DanieDemo {
    public static void main(String[] args) {

        Danie schabowySurowkaFrytkiKompot = new Kompot(new Frytki(new Surowka(new Schabowy())));
        System.out.printf("Opis zestawu: %s.\n", schabowySurowkaFrytkiKompot.pobierzOpis());
        System.out.printf("Cena zestawu to: %.2f zł.\n", schabowySurowkaFrytkiKompot.cena());

    }
}
