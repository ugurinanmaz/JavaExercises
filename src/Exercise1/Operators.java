package Exercise1;

public class Operators {
    public static void main(String[] args) {
        // operator is a symbol which will perform a set of operation between two operands
        //arithmetic operators --> + - / * %
        //relational operators (comparison operators) --> == < > <= >= !=
        //logical operators --> && || !
        //increment/decrement operators ++ --
        //assignment operator =

        int a=10;
        int b=20;
        int c = a+b;
        System.out.println("Arithmetic operators");
        System.out.println("Sum of a an b is " + a+b);
        System.out.println("Sum of a an b is " + (a+b));
        System.out.println("Sum of a an b is " + c);


        // relational operators always return a boolean value
        System.out.println("Relational operators");
        System.out.println(a==b); //false
        System.out.println(a<b); //true
        System.out.println(a>b); //false
        System.out.println(a>=b); //false
        System.out.println(a<=b); //true
        System.out.println(a!=b); //true


        //logical operators -- works between two boolean
        boolean x=true;
        boolean y=false;
        System.out.println("Logical operators");
        System.out.println(x && y); //false && (and) both side should become true otherwise it will turn false
        System.out.println(x || y); //true || (or) at least one side should be true then it will return true
        System.out.println(!y); //true || (or) at least one side should be true then it will return true
       // System.out.println(a==b ! a<b); //false

        //increment // decrement operators ++ --
        a=10;
        a++ ; //a=a+1;
        b=20;
        b--; // b=b-1
        System.out.println("increment // decrement operators");
        System.out.println(a);
        System.out.println(b);




    }
}
