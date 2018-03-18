package Zadanie4.Dodatki;

import Zadanie4.Danie;

public class Kompot extends DanieDekorator {

    Danie danie;

    public Kompot(Danie danie){
        this.danie = danie;
    }

    @Override
    public String pobierzOpis() {
        return danie.pobierzOpis() + " z kompotem";
    }

    @Override
    public double cena() {
        return danie.cena() + 1.70;
    }
}
