package InterviewQuestions;

import java.util.Scanner;

public class _12_Palindrome {

    public static void main(String[] args) {
/*      Q12_Write a Java Program to find whether a string or number is palindrome or not.
        Answer: You can use any of the reverse string program explained above
        to check whether the number or string is palindrome or not.*/

        String reverse = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Please write number or String: ");
        String userInput = scan.nextLine();
        // 123321
        // reverse = "" + "1" = "1"
        // reverse = "1" + "2" = "12"
        // reverse = "12" + "3" = "123"
        // reverse = "123" + "3" = "1233"
        // reverse = "1233" + "2" = "12332"
        // reverse = "12332" + "1" = "123321"
        for (int i =userInput.length()-1; i>=0 ; i--) {
            reverse = reverse + userInput.charAt(i);
        }
        if(userInput.equals(reverse)){
            System.out.println("Entered input is palindrome");
        }
        else{
            System.out.println("Entered input is not a palindrome");
        }
    }
}
