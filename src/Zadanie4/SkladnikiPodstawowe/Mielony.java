package Zadanie4.SkladnikiPodstawowe;

import Zadanie4.Danie;

public class Mielony extends Danie {

    @Override
    public String pobierzOpis() {
        return "Kotlet mielony";
    }

    @Override
    public double cena() {
        return 6.00;
    }
}
