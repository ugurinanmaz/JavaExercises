package HPSampleCode;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.Arrays;

public class SampleCodeForRIO {
    public static void main(String[] args) {

        int number = 5;
        for (int i = 0; i<=10; i++){
            System.out.println(number + " x " + i + " = " + number *i);
        }
        /*********SOLUTION 2 ************/
        int num = 5, i = 0;
        while (i <= 10){
            System.out.println(num + " x " + i + " = " + num * i);
            i++;
        }

        int result = 1;
        for (i = 1; i <= 15; i++) {
            result *=i;
        }
        System.out.println(result);

        evenOrOdd(44);

        int[] array = new int[30];

        for ( i = 0; i < array.length; i++) {
            if (i==0){
                array[i]=i;
            }else
                array[i]=i+array[i-1];
        }
        System.out.println(Arrays.toString(array));
        descStep5();
        int testNumber = 3;
        int[] testArray = {1,3,4,5,6,4,6};
        System.out.println(checkIfArrayContains(testNumber,testArray));
        removeDuplicatesFromArray();
        int[][] upperHalfArray = {{2, 3, 1, 5, 0},{7, 1, 5, 3, 1},{2, 5, 7, 8, 1},{0, 1, 5, 0, 1}, {3, 4, 9, 1, 5}};
        upperHalf(upperHalfArray);

        for (i = 0; i < array.length; i++) {
            array[i]= (int)(Math.random()*100);
        }
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("The average value is: " + averageOfArray(array));

        maxValueOfArray(array);
        nearestValueOfArray(array);
        System.out.println("The average value is: " + averageOfArray(array));
        System.out.println("closestNumberToAverage(array,averageOfArray(array)) = " + closestNumberToAverage(array,averageOfArray(array)));

        String msg = "I am working for QAEngineering";  //UGUR INANMAZ
        String reverseMsg ="" ;
        String qa = msg.substring(0, msg.lastIndexOf(' ')+1);
        char findChar = ' ';
        String lastWordFind = msg.substring(msg.lastIndexOf(' ')+1);
        for ( i=0; i<lastWordFind.length(); ++i) {
            findChar = lastWordFind.charAt(i);
            reverseMsg =findChar + reverseMsg ;
        }
        System.out.println( qa+ reverseMsg); //QA Engineering

        ArrayList<Integer> newArray = new ArrayList<>();
        for ( i = 0; i < array.length; i++) {
            array[i]= (int)(Math.random()*100);
            if (array[i]%2==1){
                int j=0;
                newArray.add(j,array[i]);
            }
        }
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("newArray = " + newArray);
        copyOddNumFromANArray2();
        luckyDay();
        Employee employee = new Employee("Jack", 11111111);
        employee.setBaseSalary(90_000);
        employee.setHourlyRate(44);
        System.out.println("employee.getName() = " + employee.getName());
        System.out.println("employee.getBaseSalary()) = " + employee.getBaseSalary());
        System.out.println("employee.getHourlyRate() = " + employee.getHourlyRate());
        int wage = employee.calculateWage(40);
        System.out.println("wage = " + wage);

    }

    public static void evenOrOdd(int num){
        if (num%2==0){
            System.out.println("Entered number is an Even Number.");
        }
        else {
            System.out.println("Entered number is an Odd Number.");
        }
    }
    public static void descStep5(){

        for (int i = 100; i >= 0; i-=5) {
            System.out.println(i);
        }
    }
    public static boolean checkIfArrayContains(int number , int[] array){

        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==number)
                result=true;
        }
        return result;
    }

    public static void removeDuplicatesFromArray(){
        int[] array = {11,22,33,22,44,55,44,33,22,66,88,66};
        int arrayLength=0;
        for(int i:array)
        {
            arrayLength++;
        }
        System.out.println("arrayLength = " + arrayLength);
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
        int temp=0;
        for (int i = 0; i < arrayLength-1; i++) {
            if (array[i] != array[i+1]) {
                array[temp] = array[i];
                temp++;
            }
        }
        array[temp++] = array[arrayLength - 1];
        for (int i = 0; i < temp; i++) {
            System.out.print(array[i] + " ");
        }

    }
    public static void upperHalf(int[][] array){

        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array.length ; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
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

/************************************UGUR INANMAZ*******************************************/

    public static double averageOfArray(int[] array){
        double sum =0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        double avg = sum/ array.length;
        return avg;
    }

    public static void nearestValueOfArray(int[] array){
        double[] differenceArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            differenceArray[i] = Math.abs(array[i] - averageOfArray(array));
        }
        double minNum=100;
        for(double current : differenceArray){
            minNum = Math.min(minNum,current);
        }
        int i = 0;
        int minIndex=0;
        while(i < differenceArray.length) {
            if(differenceArray[i] == minNum) {
                minIndex = i;
                break;
            }
            i++;
        }
        System.out.println("the closest number to average is : " + array[minIndex]);
    }
    public static int closestNumberToAverage(int []f,double average){
        double distance = Math.abs(f[0]-average);
        int closestNumber= f[0];
        for (int i=0; i<f.length; i++){
            double dist = Math.abs(f[i] - average);
            if (distance >dist){
                distance = dist;
                closestNumber= f[i];
            }
        }
        return closestNumber;
    }
    public static void copyOddNumFromANArray2(){
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
    public static void luckyDay(){
        int day = (int) (Math.random()*8);
        if(day==1)
        {
            System.out.println("Monday");
        } else if (day==2) {
            System.out.println("Tuesday");
        } else if (day==3) {
            System.out.println("Wednesday");
        } else if (day==4) {
            System.out.println("Thursday");
        } else if (day==5) {
            System.out.println("Friday");
        } else if (day==6) {
            System.out.println("Saturday");
        } else if (day==7) {
            System.out.println("Sunday");
        } else {
            System.out.println("This is not in a Day range");
        }
    }
}
class Employee {

    /**Encapsulation
     *
     *  -Bundle all the related data in a single unit
     *  -We can hide data! (by making fields private)
     *  -We can create public getter(read data - get date) and public setter(updating, initializing ) methods to access private fields!
     *  -
     *
     *
     *
     *
     * */

    private String  name;
    private int SSN;
    private int baseSalary;
    private int hourlyRate;

    public Employee(String name, int SSN){
        this.name=name;
        this.SSN=SSN;
    }

    public int calculateWage(int extraHours){
        return baseSalary+(extraHours*hourlyRate);
    }

    //Getter
    public String getName(){
        return name;
    }
    //Getter
    public int getBaseSalary(){
        return baseSalary;
    }
    //Setter
    public void setBaseSalary(int baseSalary){
        if (baseSalary<=0){
            throw new IllegalArgumentException("Base Salary cannot be less than 0");
        }
        this.baseSalary=baseSalary;

    }
    //Getter
    public int getHourlyRate(){
        return hourlyRate;
    }
    //Setter
    public void setHourlyRate(int hourlyRate){
        if (hourlyRate<=0){
            throw new IllegalArgumentException("Hourly Rate cannot be less than 0");
        }
        this.hourlyRate=hourlyRate;
    }

}
