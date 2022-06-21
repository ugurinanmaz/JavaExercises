package InterviewQuestions;

public class _03_EvenOddMethod {
    // Even or Odd. Write a method that will accept one int as an argument.
    // The method prints Even if the number is even and Odd if the number is odd.

    public static void main(String[] args) {
        evenOrOdd(44);
    }

    public static void evenOrOdd(int num){
        if (num%2==0){
            System.out.println("Entered number is an Even Number.");
        }
        else {
            System.out.println("Entered number is an Odd Number.");
        }
    }
}


