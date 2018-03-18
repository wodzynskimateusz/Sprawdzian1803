package Zadanie4.Dodatki;

import Zadanie4.Danie;

public class Surowka extends DanieDekorator {

    Danie danie;

    public Surowka(Danie danie){
        this.danie = danie;
    }

    @Override
    public String pobierzOpis() {
        return danie.pobierzOpis() + " z surówką";
    }

    @Override
    public double cena() {
        return danie.cena() + 2.20;
    }
}
