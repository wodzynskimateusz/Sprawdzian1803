package Zadanie4.Dodatki;

import Zadanie4.Danie;

public class Ziemniaki extends DanieDekorator {

    Danie danie;

    public Ziemniaki(Danie danie){
        this.danie = danie;
    }

    @Override
    public String pobierzOpis() {
        return danie.pobierzOpis() + " z ziemniakami";
    }

    @Override
    public double cena() {
        return danie.cena() + 2.80;
    }
}
