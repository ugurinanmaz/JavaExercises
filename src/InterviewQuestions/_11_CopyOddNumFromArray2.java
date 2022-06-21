package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class _11_CopyOddNumFromArray2 {
    public static void main(String[] args) {
        // Q_10_ After filling a 30 element array randomly (0-100), assign only single element arrays to another array.
        int[] array = new int[30];
        int j=0;
        int[] tempArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array[i]= (int)(Math.random()*100);

            if (array[i]%2==1){
                tempArray[j]=array[i];
                j++;
            }
        }
//        System.out.println("Arrays.toString(tempArray) = " + Arrays.toString(tempArray));
//        System.out.println("j = " + j);
        int[] newArray = new int[j];
        int k=0;
        for(int element : tempArray){
            if (tempArray[k]!=0){
                newArray[k]=element;
                k++;
            }
        }
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("new Array = " + Arrays.toString(newArray));
    }
}
