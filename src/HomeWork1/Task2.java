package HomeWork1;

import java.util.Scanner;

//Проверка на четность: Напишите программу, которая определяет, является ли введенное число четным или нечетным:
public class Task2 {
    public static void main(String[] args) {
        Scanner parity = new Scanner(System.in);
        int number = parity.nextInt();
        if (number % 2 == 0) {
            System.out.println("Число четное.");
        } else {
            System.out.println("Число нечетное.");
        }
    }
}
