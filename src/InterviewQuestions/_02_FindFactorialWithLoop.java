package InterviewQuestions;

public class _02_FindFactorialWithLoop {

    public static void main(String[] args) {

        // Find Factorial of 15 using loop
        int result = 1;
        for (int i = 1; i <= 15; i++) {
            result *=i;
        }
        System.out.println(result);
    }
}
