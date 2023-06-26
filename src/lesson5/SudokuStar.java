package lesson5;

import java.util.Arrays;

public class SudokuStar {
    public static void main(String[] args) {
        int field[][] = {
                {8, 0, 2, 0, 4, 9, 0, 5, 3},
                {0, 7, 6, 0, 5, 0, 1, 0, 0},
                {0, 0, 5, 0, 2, 7, 0, 0, 8},
                {6, 0, 0, 5, 0, 1, 2, 0, 7},
                {1, 8, 0, 2, 7, 0, 0, 0, 0},
                {0, 0, 0, 8, 0, 6, 0, 4, 1},
                {0, 5, 0, 4, 0, 0, 9, 0, 0},
                {0, 0, 9, 0, 6, 0, 0, 1, 5},
                {7, 0, 0, 0, 0, 0, 0, 0, 0}};
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //Создаём трёхмерный зубчатый массив
        int cube[][][] = new int[field.length][field[0].length][1];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == 0) {
                    cube[i][j] = new int[10];
                    for (int k = 0; k <= 9; k++) {
                        cube[i][j][k] = k;
                    }
                } else {
                    cube[i][j][0] = field[i][j];
                }
            }
        }
        boolean trueSolution = false;
        int counter = 0;
        //Движемся по строкам судоку.
        //Ищем пустую ячейку.
        while (!trueSolution) {
            trueSolution = true;
            for (int i = 0; i < cube.length; i++) {
                for (int j = 0; j < cube[i].length; j++) {
                    //Движемся по столбцам судоку.
                    //Ищем пустую ячейку.
                    if (cube[i][j][0] == 0) { //Если попали на пустую клетку судоку.
                        counter++;
                        trueSolution = false;
                        //Проверяем строки и столбцы.
                        //Движемся с начала текущей строки и столбца одновременно.
                        //Определяем недостающие элементы.
                        for (int k = 0; k < cube.length; k++) {
//                        //Была попытка реализовать бинарным поиском, но столбец это не массив и есть проблемы
//                        /*int lineRemMarker = Arrays.binarySearch(cube[i][j], cube[i][k][0]);
//                        int columnRemMarker = Arrays.binarySearch(cube[i][j], cube[k][j][0]);
//                        if (lineRemMarker >= 0) {
//                            cube[i][j][lineRemMarker] = 0;
//                        }
//                        if (columnRemMarker >= 0) {
//                            cube[i][j][columnRemMarker] = 0;
//                        }*/
                            //Движемся в глубину пустой ячейки.
                            for (int l = 1; l < cube[i][j].length; l++) {
                            /*  cube[i][k][0] - все элементы i-ой строки, начиная с нулевого.
                                cube[i][j][l] - все элементы, уходящие вглубь пустой ячейки.
                                Ведём линейный поиск.
                                Если элементы совпали, удаляем глубинный элемент.
                            */
                                if (cube[i][k][0] == cube[i][j][l]) {
                                    cube[i][j][l] = 0;
                                } else if (cube[k][j][0] == cube[i][j][l]) {
                                /*  cube[k][j][0] - все элементы j-ого столбца, начиная с нулевого.
                                cube[i][j][l] - все элементы, уходящие вглубь пустой ячейки.
                                Ведём линейный поиск.
                                Если элементы совпали, удаляем глубинный элемент.
                            */
                                    cube[i][j][l] = 0;
                                }
                            }
                        }
                        //Проверяем соты 3*3
                        int lines = 0, columns = 0;
                        int left = (int) (Math.floor(((double) j / 3.0))) * 3, top = (int) (Math.floor(((double) i / 3.0))) * 3;
                        int right = left + 2, down = top + 2;
                        for (int k = top; k <= down; k++) {
                            for (int l = left; l <= right; l++) {
                                for (int m = 1; m < cube[i][j].length; m++) {
                                    if (cube[k][l][0] == cube[i][j][m]) {
                                        cube[i][j][m] = 0;
                                    }
                                }
                            }
                        }
                        System.out.print(counter + " - ");
                        for (int k = 1; k < cube[i][j].length; k++) {
                            if (cube[i][j][k] != 0) {
                                cube[i][j][0] = cube[i][j][k];
                            }
                            System.out.print(cube[i][j][k] + " ");
                        }
                        System.out.println();
                    }
                }
            }
        }
        System.out.println();
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                System.out.print(cube[i][j][0] + " ");
            }
            System.out.println();
        }
    }
}
