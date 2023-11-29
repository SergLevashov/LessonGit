package HomeWork2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scannerArray = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int length = scannerArray.nextInt();
        int[] array = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            array[i] = scannerArray.nextInt();
        }
        int minIndex = 0; 
        int equalMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[minIndex] > array[i]) {
                minIndex = i;
            } if (array[minIndex] == array[i]){
                equalMin = i;
            }
        }

        System.out.println("Индекс минимального элемента: " + minIndex + " и " + equalMin);
    }
}
