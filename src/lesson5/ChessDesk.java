package lesson5;

import java.util.Arrays;

public class ChessDesk {
    public static void main(String[] args) {
        String chessDesk[][] = new String[8][8];
        for (int i = 0; i < chessDesk.length; i++) {
            for (int j = 0; j < chessDesk[i].length; j++) {
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
                    chessDesk[i][j] = "W";
                }
                else {
                    chessDesk[i][j] = "B";
                }
                System.out.print(chessDesk[i][j] + " ");
            }
            System.out.println();
        }
    }
}
