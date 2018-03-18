package Zadanie6;

public class Podtablice {

    private int[][] tab = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    public int[][] subTab(int[][] tab, int x, int y, int sizeX, int sizeY) {
        int[][] sub = new int[sizeY][sizeX];
        int helper;

        for (int i = 0; i < sub.length; i++) {
            helper = x;
            for (int j = 0; j < sub[i].length; j++) {
                sub[i][j] = tab[y][helper];
                helper++;
            }
            y++;
        }
        return sub;
    }
}
