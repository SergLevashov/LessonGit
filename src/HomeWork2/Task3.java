package HomeWork2;

import java.sql.Array;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int array[][] = {{1, 2, 3, 4, 5},
                     {2, 3, 4, 5, 6},
                     {3, 4, 5, 6, -7}};

        for (int i = 0; i < 3; i++) {
            System.out.print("строка " + i + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int rowIndex = 0;
        int columnIndex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
              if (array[rowIndex][columnIndex] > array[i][j]) {
                  rowIndex = i;
                  columnIndex = j;
              }
            }
        }
        int[] array2 = new int[] {rowIndex, columnIndex};


        System.out.println(Arrays.toString(array2));

    }
}
