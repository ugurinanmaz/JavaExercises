package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class _11_CopyOddNumFromArray {
    public static void main(String[] args) {
       // Q_10_ After filling a 30 element array randomly (0-100), assign only single element arrays to another array.
        int[] array = new int[30];
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            array[i]= (int)(Math.random()*100);
            if (array[i]%2==1){
                int j=0;
                newArray.add(j,array[i]);
            }
        }
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("newArray = " + newArray);

    }
}
