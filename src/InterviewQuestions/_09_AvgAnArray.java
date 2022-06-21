package InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;

public class _09_AvgAnArray {
    public static void main(String[] args) {
/*        Task: Generate an array of 10 integers randomly (between 0-100) and find the average.
                // Create three methods to print out below-->
                // 1.) max value of array
                // 2.) index of the max value
                // 3.) the closest value to the average.
                        Output example:
                [24, 94, 82, 66, 53, 70, 24, 40, 71, 73]
                The average is:59.7
                The maximum value is: 94 and it is at index 1
                the closest number to average is : 66*/
        
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]= (int)(Math.random()*100);
        }
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("The average value is: " + averageOfArray(array));

        maxValueOfArray(array);
        nearestValueOfArray(array);

       // System.out.println("nearestValueOfArray(array) = " + nearestValueOfArray(array));
        
    }

    public static void maxValueOfArray(int[] array){
        //find the max value and the index of the max value in the given array
        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max=array[i];
                index=i;
            }
        }
        System.out.println("The maximum value is: " + max + " and it is at : " + index );
    }

/*    public static int indexValueOfArray(int[] array){
        int index = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max=array[i];
                index=i;
            }
        }
        return index;
    }*/

    public static double averageOfArray(int[] array){
        //find the average of array
        double sum =0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        double avg = sum/ array.length;
        return avg;
    }

    public static void nearestValueOfArray(int[] array){
        //3.) the closest value to the average.
        double[] differenceArray = new double[array.length];
        //Find the difference value and assign the values to an array 
        for (int i = 0; i < array.length; i++) {
            differenceArray[i] = Math.abs(array[i] - averageOfArray(array));
        }
        //System.out.println("differenceArray = " + Arrays.toString(differenceArray));
        
        //Find the minimum number in the difference array to find the index
        double minNum=100;
        for(double current : differenceArray){
            minNum = Math.min(minNum,current);
        }
        //System.out.println("minNum = " + minNum);

        //find the index of minimum value in difference array using minNum
        int i = 0;
        int minIndex=0;
        while(i < differenceArray.length) {
            if(differenceArray[i] == minNum) {
                minIndex = i;
                break;
            }
            i++;
        }
        //System.out.println("minIndex = " + minIndex);

        //print the value of minIndex in created array 
        System.out.println("the closest number to average is : " + array[minIndex]);
    }
}
