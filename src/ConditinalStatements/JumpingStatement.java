package ConditinalStatements;

public class JumpingStatement {

    public static void main(String[] args) {

        //Jump Statement

        //break - continue

        for (int i = 1 ; i <=10 ; i++){
            //if we want to break the loop for some conditions are reached.
            if (i==5){
                break;
            }
            System.out.println(i);
        }

        for (int i = 1 ; i <=10 ; i++){
            //if we want to except some conditions for the scenario we can jump the
            if (i==5){
                continue;
            }
            System.out.println(i);
        }

        for (int i = 1 ; i <=10 ; i++){
            if (i==3 || i==5 || i==7){ // it skips]l to print 3,5,7 and prints all others
                continue;
            }
            System.out.println(i);
        }



    }
}
