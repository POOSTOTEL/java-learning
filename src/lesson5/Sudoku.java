package lesson5;

public class Sudoku {
    public static void main(String[] args) {
        int field[][] = {
                {8, 1, 2, 6, 4, 9, 7, 5, 3},
                {9, 7, 6, 3, 5, 8, 1, 2, 4},
                {4, 3, 5, 1, 2, 7, 6, 9, 8},
                {6, 9, 4, 5, 3, 1, 2, 8, 7},
                {1, 8, 3, 2, 7, 4, 5, 6, 9},
                {5, 2, 7, 8, 9, 6, 3, 4, 1},
                {3, 5, 1, 4, 8, 2, 9, 7, 6},
                {2, 4, 9, 7, 6, 3, 8, 1, 5},
                {7, 6, 8, 9, 1, 5, 4, 3, 2}
        };
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        //Проверка всех элементов в строка
        boolean sudoku = true;
        for (int i = 0; i < field.length; i++) {
            int checker[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int counter = 0;
            for (int j = 0; j < field[i].length; j++) {
                for (int k = 0; k < checker.length; k++) {
                    if (field[i][j] == checker[k]) {
                        checker[k] = 0;
                        counter++;
                        continue;
                    }
                }
            }
            if (counter != 9) {
                sudoku = false;
                break;
            }
        }
        //Проверка элементов в столбцах
        for (int j = 0; j < field.length; j++) {
            int checker[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int counter = 0;
            for (int i = 0; i < field[j].length; i++) {
                for (int k = 0; k < checker.length; k++) {
                    if (field[i][j] == checker[k]) {
                        checker[k] = 0;
                        counter++;
                        continue;
                    }
                }
            }
            if (counter != 9) {
                sudoku = false;
                break;
            }
        }
        //Проверка подмассивов 3*3
        int lines = 0, columns = 0;
        int left = 0, right = 2, top = 0, down = 2;
        while (lines < 3) {
            while (columns < 3) {
                int checker[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                int counter = 0;
                for (int i = left; i <= right; i++) {
                    for (int j = top; j <= down; j++) {
                        for (int k = 0; k < checker.length; k++) {
                            if (field[i][j] == checker[k]) {
                                checker[k] = 0;
                                counter++;
                                continue;
                            }
                        }
                    }
                }
                if (counter != 9) {
                    sudoku = false;
                    break;
                }
                left += 3;
                right += 3;
                columns++;
            }
            top += 3;
            down += 3;
            lines++;
        }
        System.out.println(sudoku);
    }
}
