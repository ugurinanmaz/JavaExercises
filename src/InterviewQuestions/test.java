package InterviewQuestions;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55};
        int number = 22;
        boolean value = contains(array, number);
        System.out.println("Array contains " + number + "-->" + value);
//        System.out.println(Arrays.binarySearch(array, number) );
    }
    public static boolean contains(int[] array, int value) {
        return Arrays.binarySearch(array, value) >= 0;
    }
}
