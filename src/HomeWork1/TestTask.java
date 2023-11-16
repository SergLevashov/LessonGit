package HomeWork1;

import java.util.Arrays;

// УПРАЖНЕНИЯ ПО МАССИВАМ
public class TestTask {
    public static void main(String[] args) {
        int [] a = {68, 100, 40, 25, 99};
        for (int i : a) {                                   // можно вывести массив с помощью цикла foreach так
            System.out.println(i);
        }
        // ИЛИ
        for (int i = 0; i < a.length; i++) {                // можно вывести массив так
            System.out.println(a[i]);
        }
        // ИЛИ через даже WHILE
        int i = 0;
        while (i < a.length) {                              // можно вывести массив и так
            System.out.println(a[i]);
            i++;
        }
        System.out.println(Arrays.toString(a));     // выводим массив в строчку
        Arrays.sort(a, 0, 5);     // сортируем данный массив от меньшего числа к большему
        System.out.println(Arrays.toString(a));     // выводим отсортированный массив
        int key = Arrays.binarySearch(a,25);        // key число в массиве индекс которого нужно найти
        System.out.println(key);        // выводим это число на экран
        System.out.println(Arrays.binarySearch(a,100));        // сразу печатаем индекс искомого числа
        int znach = a[0];       // создаем переменую и присваиваем ей какую то ячейку в которой мы хотим знать что лежит
        System.out.println(znach);      // выводим на экран значение этой ячейки
        System.out.println(a.length);       // вывести длинну массива




    }

}



//if (n % var != 0) {
//        var++;
/*
 Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Введите простое число");
        int number = input.nextInt();
 */