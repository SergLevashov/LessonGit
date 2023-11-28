package HomeWork2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер элемента ряда Фибоначчи: ");

        int numbElem = scanner.nextInt();
        int fib = 0;

        if (numbElem == 1 || numbElem == 2){
            fib = 1;
            System.out.println("Элемент ряда Фибоначчи под номером " + numbElem + ", равен: " + fib);
        }else {
            int fib1 =1;
            int fib2 =1;
            for (int i = 3; i <= numbElem; i++) {
                fib = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib;
            }

            System.out.println("Элемент ряда Фибоначчи под номером " + numbElem + ", равен: " + fib);
        }


    }
}