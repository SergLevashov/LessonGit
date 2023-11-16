package HomeWork1;

import java.util.Scanner;

/*Калькулятор: Напишите программу-калькулятор,
 которая выполняет арифметические операции (сложение, вычитание, умножение, деление)
 над двумя числами в зависимости от выбора пользователя:
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);
        int a = calculator.nextInt();
        int b = calculator.nextInt();
        String c = calculator.nextLine().trim();
        switch (c) {
            case "+" -> System.out.println(a + b);
            case "-" -> System.out.println(a - b);
            case "*" -> System.out.println(a * b);
            case "/" -> System.out.println(a / b);
            default -> System.err.println("Неправильный оператор");
        }
    }
}
