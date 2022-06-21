package InterviewQuestions;

public class _05_DescStep5 {
    public static void main(String[] args) {
//        Q5 - Write a method that uses a for loop to display numbers
//        in descending order in the step of 5 starting from 100.
//        Call your method from the main method.

        descStep5();
    }
    public static void descStep5(){

        for (int i = 100; i >= 0; i-=5) {
            System.out.println(i);
        }
    }
}
