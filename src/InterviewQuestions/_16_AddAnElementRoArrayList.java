package InterviewQuestions;

import java.util.ArrayList;

public class _16_AddAnElementRoArrayList {
    public static void main(String[] args) {
/*      O-16 - Create an empty ArrayList called toDoList. Time to add some to-dos!
        Create a method that accepts a String arraylist and a String as parameters
        // it should add element at the first index of arraylist
        Sample Output:
        ["Water plant", "Walk with dog", "Study Java"] ->
        ["Have breakfast", "Water plant", "Walk with dog", "Study Java"]*/

        ArrayList<String> toDoList = new ArrayList();
        toDoList.add("Water plant");
        toDoList.add("Walk with dog");
        toDoList.add("Study Java");
        System.out.println("Original toDoList = " + toDoList);
        toDoList.add(0,"Have breakfast");
        System.out.println("After adding first element to the toDoList = " + toDoList);

    }
}
