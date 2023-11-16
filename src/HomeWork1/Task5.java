package HomeWork1;

import java.util.Scanner;

//Определение високосного года: Напишите программу, которая определяет, является ли заданный год високосным:
public class Task5 {
    public static void main(String[] args) {
        Scanner leapYear = new Scanner(System.in);
        int year = leapYear.nextInt();
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
