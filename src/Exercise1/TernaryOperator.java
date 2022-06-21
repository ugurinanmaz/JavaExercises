package Exercise1;

public class TernaryOperator {
    public static void main(String[] args) {
        int day = (int) (Math.random()*8);
        //ternary operator
        String d = day == 1 ? "Monday" : day ==2 ? "Tuesday" : day ==3 ? "Wednesday"
                : day ==4 ? "Thursday" : day ==5 ? "Friday" : day ==6 ? "Saturday"
                : day ==7 ? "Sunday"
                : "This is not in a Day range";
        System.out.println(d);
    }
}
