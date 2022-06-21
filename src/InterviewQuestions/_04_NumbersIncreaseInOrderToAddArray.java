package InterviewQuestions;

import java.util.Arrays;

public class _04_NumbersIncreaseInOrderToAddArray {

/*    -Create an empty array with a size of 10
      -After creating the array, fill the array with the number starting from 0 and increasing in order like:
       (0,1,3,6,10,15) Meaning it will always increase one more than the last increase*/

    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            if (i==0){
                array[i]=i;
            }else
                array[i]=i+array[i-1];
        }
        System.out.println(Arrays.toString(array));

    }

}
