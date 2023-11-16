package Lesson1;

import java.util.Arrays;
import java.util.Scanner;
/*
    Дано двузначное число.
    Вывести сначала первую цифру (единицы) на разных строках, затем правую (десятки)

    Входные данные: 78
    Выходные данные: 7
                     8
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();

        int first = number / 10;
        int second = number % 10;
        //System.out.println(first + " | " + second);
        System.out.println(first);
        System.out.println(second);
    }
}
