package InterviewQuestions;

import java.util.Arrays;

public class _14_Find2ndHighestNumberInArray {
    public static void main(String[] args) {
        /*Q14 - Write a Java Program to find the second-highest number in an array.

        Answer:  In this program, we have initialized an array with 10 elements
        out of which we are going to find the second-highest number.*/
        int[] array = {44,22,11,55,44,33,55,99,66,55};
        Arrays.sort(array);  // array is sorted.
        int secondHighest = array[array.length-2];
        System.out.println("secondHighest = " + secondHighest);

    }
}
