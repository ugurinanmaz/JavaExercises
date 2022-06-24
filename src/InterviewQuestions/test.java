package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class test {

/*    O-16 - Create an empty ArrayList called toDoList. Time to add some to-dos!
    Create a method that accepts a String arraylist and a String as parameters
    // it should add element at the first index of arraylist*/
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        toDoList.add("Water plant");
        toDoList.add("Walk with dog");
        toDoList.add("Study Java");
        System.out.println(toDoList);

        printToDoList(toDoList,"Have breakfast");
        System.out.println(toDoList);
        String firstElement="HaveBreakfast";
        printToDoList(toDoList,firstElement);
        printToDoList(toDoList,1);
        System.out.println("toDoList = " + toDoList);
        ArrayList<String> toDoList2 = new ArrayList<>();
        toDoList2.add("Water grass");
        toDoList2.add("Walk with cat");
        toDoList2.add("Study Soft skills");
        System.out.println(toDoList2);
        printToDoList(toDoList2);
        System.out.println(toDoList2);
    }
    public static ArrayList<String> printToDoList(ArrayList<String> newToDo, String something) {
        newToDo.add(0, something);
        return newToDo;
    }
    public static ArrayList<String> printToDoList(ArrayList<String> newToDo) {
        newToDo.add(0, "Ahmet");
        return newToDo;
    }
    public static ArrayList<String> printToDoList(ArrayList<String> newToDo, int index) {
        newToDo.add(index, "Ahmet");
        return newToDo;
    }

}



