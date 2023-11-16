package Lesson2;

import java.lang.reflect.Array;

public class MassTask4 {
        public static void main(String[] args) {

            int[][] array = new int[5][5];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = (int) (Math.random() * 10);
                }
            }

           // System.out.println(Array.deepToString(array));

            int minElemIndexI = 0;
            int minElemIndexJ = 0;
            int minElem = array[minElemIndexI][minElemIndexJ];


            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    int currentElem = array[i][j];

                    if(currentElem <= minElem) {
                        minElem = currentElem;
                        minElemIndexI = i;
                        minElemIndexJ = j;
                    }
                }
            }

            System.out.println("Min elem " + minElem);
            System.out.println("Min indexes i = " + minElemIndexI);
            System.out.println("Min indexes j = " + minElemIndexJ);
        }



    }

