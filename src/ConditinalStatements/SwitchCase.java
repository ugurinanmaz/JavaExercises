package ConditinalStatements;

public class SwitchCase {
    public static void main(String[] args) {

            /// if we have more than 3 condition we use switch case condition
        int day = 3; // if we are checking equality of the case we use switch Case Condition

        switch (day) // expression - this  is a variable
        {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("This is not in a Day range");
    }

    }
}
