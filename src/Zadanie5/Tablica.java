package Zadanie5;

public class Tablica {

    private int[][] tab = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    public void mirror(int[][] tab) {

        int[][] pionowo = new int[tab.length][tab[0].length];
        int[][] poziomo = new int[tab.length][tab[0].length];
        int helper1 = tab.length - 1;
        int helper2 = 0;

        // ODWRACANIE
        for (int i = 0; i < tab.length; i++) {
            helper2 = tab[i].length - 1;
            for (int j = 0; j < tab[i].length; j++) {
                poziomo[helper1][j] = tab[i][j];
                pionowo[i][helper2] = tab[i][j];
                helper2--;
            }
            helper1--;
        }


        // DRUKOWANIE
        System.out.println("Tablica odwrócona względem osi pionowej");
        for (int i = 0; i < pionowo.length; i++) {
            for (int j = 0; j < pionowo[i].length; j++) {
                System.out.print(pionowo[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Tablica odwrócona względem osi poziomej");
        for (int i = 0; i < poziomo.length; i++) {
            for (int j = 0; j < poziomo[i].length; j++) {
                System.out.print(poziomo[i][j] + "  ");
            }
            System.out.println();
        }


    }
}
