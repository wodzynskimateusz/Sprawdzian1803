package Zadanie6;

public class PodtabliceDemo {
    public static void main(String[] args) {

        int[][] tab = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        Podtablice podtablice = new Podtablice();
        int[][] podtab = podtablice.subTab(tab, 0, 0, 2, 3);

        for (int i = 0; i < podtab.length; i++) {
            for (int j = 0; j < podtab[i].length; j++) {
                System.out.print(podtab[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
