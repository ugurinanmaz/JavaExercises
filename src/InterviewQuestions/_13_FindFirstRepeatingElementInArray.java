package InterviewQuestions;

import java.util.Arrays;

public class _13_FindFirstRepeatingElementInArray {
    public static void main(String[] args) {
/*        Q-13.Find the first repeating element in array of integers.
        Example: Input :
        Input: array[] = {10, 7, 8, 1, 8, 7, 6}
        Output: 7 [7 is the first element actually repeats]*/
        int[] array = new int[10];
        //int checkNum;
        for (int i = 0; i < array.length; i++) {
            array[i]=(int) (Math.random()*100);
        }
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        Arrays.sort(array);  // array is sorted.
        System.out.println("Sorted Array = " + Arrays.toString(array));
        int check=0;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]==array[i+1]){
                System.out.println( "first repeating element : " + array[i] + " at index " + i  );
                check++;
                break;
            }
        }
        if (check==0){
            System.out.println("There is no repeating number in the array");
        }

    }
}
