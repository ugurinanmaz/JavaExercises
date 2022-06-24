package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class _17_CheckIfAllNumArrayListOdd {
    public static void main(String[] args) {
        /*Q-17 - Check if an ArrayList of integer numbers contains only odd numbers? (method)
         Output : true - false */
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(11,33,55,77,99));
        boolean isOnlyOdd= checkIfArraysOddNumbers(arrayList);
        System.out.println("isOnlyOdd = " + isOnlyOdd);
    }
/*    public static boolean checkIfArraysOddNumbers(ArrayList<Integer> list) {
        for (Integer element: list) {
            if (element%2 == 0)
                return false;
        }
        return true;
    }*/

    public static boolean checkIfArraysOddNumbers(ArrayList<Integer> list) {
        for (int i = 0 ; i< list.size() ; i++) {
            if (list.get(i)%2 == 0)
                return false;
        }
        return true;
    }

}
