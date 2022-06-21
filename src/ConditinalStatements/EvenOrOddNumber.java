package ConditinalStatements;

public class EvenOrOddNumber {
    public static void main(String[] args) {

        int num =5;
        if(num%2 == 0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }

        int i = num%2 == 0 ? 0 : 1;
        System.out.println(i);

        String p = "";
        p = num%2 == 0 ? "Number is Even" : "Number is Odd";
        System.out.println(p);
    }
}
