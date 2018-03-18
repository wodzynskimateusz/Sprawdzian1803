package Zadanie4.Dodatki;

import Zadanie4.Danie;

public class Frytki extends DanieDekorator {

    Danie danie;

    public Frytki(Danie danie){
        this.danie = danie;
    }

    @Override
    public String pobierzOpis() {
        return danie.pobierzOpis() + " z frytkami";
    }

    @Override
    public double cena() {
        return danie.cena() + 3.50;
    }
}
