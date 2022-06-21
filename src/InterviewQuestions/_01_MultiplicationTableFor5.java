package InterviewQuestions;

public class _01_MultiplicationTableFor5 {
    public static void main(String[] args) {
        //Write a program in Java to display the multiplication table of 5.
        // 5 x 0 = 0
        // 5 x 1 = 5
        // ...
        // 5 x 10 = 50

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
    }

}
