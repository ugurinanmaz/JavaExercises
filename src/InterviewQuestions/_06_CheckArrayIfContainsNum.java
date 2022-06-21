package InterviewQuestions;

public class _06_CheckArrayIfContainsNum {

    public static void main(String[] args) {

//        Q6-Write a function to check if an array contains a particular number
//        Example : {1,2,3,4,5} num=3 ---> true

        int testNumber = 3;
        int[] testArray = {1,3,4,5,6,4,6};
        System.out.println(checkIfArrayContains(testNumber,testArray));
            }

    public static boolean checkIfArrayContains(int number , int[] array){

        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==number)
                result=true;
        }
        return result;
    }
}
