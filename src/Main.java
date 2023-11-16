import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        do {
            r = new Random().nextInt();
            System.out.println(r);
        } while (r > 50);
    }
}








/*
Scanner factorial = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int n = factorial.nextInt();
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            System.out.println(result);
 */