package HomeWork1;

import java.util.Scanner;
// Напишите программу, которая преобразует введенное число в римскую систему счисления:
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String[] a = {"I", "IV", "V", "IX", "X", "XL", "L", "CD", "C", "D", "CM", "M"};
        int[] b = {1, 4, 5, 9, 10, 40, 50, 100, 400, 500, 900, 1000};
        for (; n > 0; ) {

            for (int i = 0; i < b.length; i++) {
                if (n < b[i]) {
                    System.out.print(a[i - 1]);
                    n = n - b[i - 1];
                    break;
                }
            }
        }
    }
}

//for (int i = b.length - 1; i >= 0; i--) {
//        if (n > b[i]){
//        System.out.println(a [i]);
//        n = n - b[i];
//        break;
//        }
//        }
/*
 int i = 0;
                while (num > 0) {
                    if (num >= rimNum[i]) {
                        System.out.print(rimName[i]);
                        num -= rimNum[i];
                    } else
                        i++;
                }
 */