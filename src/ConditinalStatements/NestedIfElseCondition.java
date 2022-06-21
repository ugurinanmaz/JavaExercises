package ConditinalStatements;

public class NestedIfElseCondition {
    public static void main(String[] args) {

        int day = (int) (Math.random()*8);

        if(day==1)
        {
            System.out.println("Monday");
        } else if (day==2) {
            System.out.println("Tuesday");
        } else if (day==3) {
            System.out.println("Wednesday");
        } else if (day==4) {
            System.out.println("Thursday");
        } else if (day==5) {
            System.out.println("Friday");
        } else if (day==6) {
            System.out.println("Saturday");
        } else if (day==7) {
            System.out.println("Sunday");
        } else {
            System.out.println("This is not in a Day range");
        }












/*        //nested ternary operator
        String d = "";
        d = day == 1 ? "Monday" : day ==2 ? "Tuesday" : "not in range";
        System.out.println(d);*/


    }
}
