package HomeWork1;

import java.util.Scanner;

// Сравнение чисел: Напишите программу, которая сравнивает два числа и определяет,
 // равны ли они или одно больше другого:
public class Task1 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int num1 = scanner.nextInt();
         int num2 = scanner.nextInt();
         if (num1 > num2) {
             System.out.println("Первое число больше второго.");
         }
         else if(num1 < num2) {
             System.out.println("Первое число меньше второго.");
         }
         else {
             System.out.println("Числа равны.");
         }
     }
}
