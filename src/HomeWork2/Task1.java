package HomeWork2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        Scanner scannerArray = new Scanner(System.in);
        System.out.print("Введите длину массива: ");

        int length = scannerArray.nextInt();
        int[] array = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            array[i] = scannerArray.nextInt();
        }

        boolean isFound = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                isFound = true;
                break;
            }
        }

        System.out.println(isFound);
    }
}