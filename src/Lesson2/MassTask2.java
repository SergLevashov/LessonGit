package Lesson2;

public class MassTask2 {
    public static void main(String[] args) {
        Outer:
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10 ; j++) {

                if ((i * j) % 2 != 0);
                System.out.println( i + " " + j + " " + i*j);
                
            }
        }
    }
}
