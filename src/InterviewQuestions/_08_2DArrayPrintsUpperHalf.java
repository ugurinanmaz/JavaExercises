package InterviewQuestions;

import javax.management.StandardEmitterMBean;
import java.util.Arrays;

public class _08_2DArrayPrintsUpperHalf {

    public static void main(String[] args) {
/*     Q8 - Write a user defined method named Upper-half() which takes a two dimensional
array A, with size N rows and N columns as argument and prints the upper half of the array.
        e.g.,
        2 3 1 5 0                               2 3 1 5 0
        7 1 5 3 1                               1 5 3 1
        2 5 7 8 1     The output will be        7 8 1
        0 1 5 0 1                               0 1
        3 4 9 1 5                               5*/


        int[][] array1 = {{2, 3, 1, 5, 0},{7, 1, 5, 3, 1},{2, 5, 7, 8, 1},{0, 1, 5, 0, 1}, {3, 4, 9, 1, 5}};
        upperHalf(array1);

    }

    public static void upperHalf(int[][] array){

        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array.length ; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }


}
