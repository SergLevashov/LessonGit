package Lesson2;


public class MassTask1 {
    public static void main(String[] args) {
        int lol = 56;

        outer:
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {

                if (i * j == lol) {
                    System.out.println("Ищем" + i + " " + j);
                    break outer;
                }
            }
        }
    }
}
