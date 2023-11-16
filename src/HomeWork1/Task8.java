package HomeWork1;

//Проверка на простое число: Напишите программу, которая определяет, является ли заданное число простым.
public class Task8 {
    public static void main(String[] args) {
        for (int j = 0; j < 2000; j++) {
            Boolean prime = isPrime(j);
            if (prime) {
                System.out.print(j + " ");
            }
        }
    }

    private static Boolean isPrime(int j) {
        for (int i = 2; i <= Math.sqrt(j); i++) {
            if (j % i == 0) {
                return false;
            }
        }
        return true;
    }
}
// новые изменния для коммита
