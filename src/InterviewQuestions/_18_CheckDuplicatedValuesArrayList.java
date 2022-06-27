package InterviewQuestions;

import java.util.*;

public class _18_CheckDuplicatedValuesArrayList {

    public static void main(String[] args) {
/*      Q-18 - Create an Arraylist with random 10 integers between 1-10 (1 and 10 included)
        Create a method to check how many times each integers duplicated,
        and print them all with duplicated times and add to another empty Arraylist without any duplicated values..

        Output : Original Arraylist is : [5, 8, 6, 9, 2, 5, 7, 3, 3, 1]
        5 is duplicated 2 times
        8 is not duplicated
        6 is not duplicated
        9 is not duplicated
        2 is not duplicated
        7 is not duplicated
        3 is duplicated 2 times
        1 is not duplicated
        New Arraylist is : [5, 8, 6, 9, 2, 7, 3, 1]*/

        //ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(2, 3, 3, 3, 4, 6, 7, 9, 10, 10));
         Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <10; i++) {
            int index = ((random.nextInt(10))+1);
            arrayList.add(index);
        }
        System.out.println("Before sorting the arrayList = " + arrayList);
        Collections.sort(arrayList);
        System.out.println("After sorting the arrayList = " + arrayList);

        checkDuplicated(arrayList);

    }
    public static void checkDuplicated(ArrayList<Integer> arrayList){

        for (int i = 0 ; i <arrayList.size(); i++){
            int checkNum=1;
            for (int j = i+1; j < arrayList.size()-1; j++) {
                if (arrayList.get(j)==arrayList.get(i)){
                    checkNum++;
                    continue;
                }
            }

            if (arrayList.get(i+checkNum-1) == arrayList.get(arrayList.size()-1))
                checkNum++;


            if (checkNum>1 ){
                System.out.println(arrayList.get(i+checkNum-1) +" is duplicated " + checkNum + " times" );
                i+=checkNum-1;
                continue;

            } else{
                System.out.println(arrayList.get(i+checkNum-1) + " is not duplicated");
            }
        }
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer element : arrayList) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        System.out.println("newList = " + newList);
    }


}
