package InterviewQuestions;

import java.util.ArrayList;

public class _15_SecondElementOfArrayList {

    public static void main(String[] args) {
//        Q-15 - Write a Java program to replace the second element of a ArrayList with the specified element.
//        SAMPLE OUTPUT :
//        Original array list: [Red, Green]
//        Replace second element with 'White'.
//        Red
//        White
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Green");
        System.out.println("before changing 2nd element of the arrayList = " + arrayList);
        arrayList.set(1,"White");
        System.out.println("after changing 2nd element of the arrayList = " + arrayList);
    }
}
