package Exercise1;

public class ReverseTheWord {

    public static void main(String[] args) {

        String msg = "I work for QAEngineering";

        char chr;
        String revs = "";

        System.out.println(msg.indexOf('Q'));
        System.out.println(msg.substring(msg.indexOf('Q')));

        for (int i =0; i<msg.length(); ++i) {

            chr= msg.charAt(i); // find each char of string
            revs = chr+revs;  // add the finding characters in front of the existing string
            //revs == "gnireenignEAQ") ? break;

            //System.out.println(revs);
        }

        System.out.println(revs);



    }
}
