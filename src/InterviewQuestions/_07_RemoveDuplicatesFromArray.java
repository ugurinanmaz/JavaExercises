package InterviewQuestions;

import java.util.Arrays;

public class _07_RemoveDuplicatesFromArray {


    public static void main(String[] args) {

/*        Q7 - Create an integer array, it includes duplicated numbers.
            How to remove duplicates from an array, without using API methods in Java?
                */
        int[] array = {11,22,33,22,44,55,44,33,22,66,88,66};

        //find array length
        int arrayLength=0;
        for(int i:array)
        {
            arrayLength++;
        }
        System.out.println("arrayLength = " + arrayLength);

        // sort array
        //Arrays.sort(array);
        int tempSort;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i+1; j < arrayLength; j++) {
                //  array[i] =    33> array[j] = 22
                if (array[i]>array[j]){
                    tempSort = array[i];
                    array[i]=array[j];
                    array[j]=tempSort;
                }
            }
        }

        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));

        //remove duplicated values in array
//Arrays.toString(array) = [11, 22, 22, 22, 33, 33, 44, 44, 55, 66, 66, 88]
        int temp=0;

        for (int i = 0; i < arrayLength-1; i++) {
            if (array[i] != array[i+1]) {
                array[temp] = array[i];
                temp++;
            } 
        }
        //System.out.println("after comparing elements = " + Arrays.toString(array));

        array[temp++] = array[arrayLength - 1];
        //System.out.println("Arrays.toString(tempArray) = " + Arrays.toString(array));
        for (int i = 0; i < temp; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
