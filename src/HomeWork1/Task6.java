package HomeWork1;

import java.util.Scanner;

//Расчет факториала: Пользователь вводит число, программа должна вычислить его факториал:
public class Task6 {
    public static void main(String[] args) {
        Scanner factorial = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int n = factorial.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        System.out.println(result);
    }
}
