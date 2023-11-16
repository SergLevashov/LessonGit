package HomeWork1;

import java.util.Scanner;

public class Task81 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numb = console.nextInt();

        String a = "Это число простое";
        for (int i = 2; i <= Math.sqrt(numb); i++) {
            if (numb % i == 0) {
                a = "Это число не простое!";
            }
        }
        System.out.println(a);
    }
}