package HomeWork1;

import java.util.Scanner;

// Определение времени суток: Пользователь вводит текущее время (часы),
// программа должна определить, утро, день, вечер или ночь:
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число от 0 до 23");
        int hour = input.nextInt();
        if (hour >= 0 && hour <= 3) {
            System.out.println("Ночь.");
        } else if (hour < 12) {
            System.out.println("Утро.");
        } else if (hour < 17) {
            System.out.println("День.");
        } else if (hour < 24) {
            System.out.println("Вечер.");
        } else {
            System.err.println("Неверное число");
        }
    }
}




