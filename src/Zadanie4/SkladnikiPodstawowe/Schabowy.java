package Zadanie4.SkladnikiPodstawowe;

import Zadanie4.Danie;

public class Schabowy extends Danie {

    @Override
    public String pobierzOpis() {
        return "Kotlet schabowy";
    }

    @Override
    public double cena() {
        return 8.00;
    }
}
