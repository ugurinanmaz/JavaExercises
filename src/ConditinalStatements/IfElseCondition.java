package ConditinalStatements;

public class IfElseCondition {
    public static void main(String[] args) {

        int age =20;
        if(age>=18)   /// we don't have to put { if there is only one statement in if or else block
            System.out.println("eligible for vote");
        else
            System.out.println("ineligible for vote");
        //with { } we use like below
        if(age>=18){
            System.out.println("eligible for vote");
        }
        else {  // else block is optional we don't have to use like always
            System.out.println("ineligible for vote");
        }
    }
}
