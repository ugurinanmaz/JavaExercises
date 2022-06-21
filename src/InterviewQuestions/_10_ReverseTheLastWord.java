package InterviewQuestions;

public class _10_ReverseTheLastWord {
    public static void main(String[] args) {
        //Reverse a word "QAEngineering" from string "I am working for QAEngineering"

        String msg = "I am working for QAEngineering";
        String reverseMsg ="" ;
        String qa = msg.substring(0, msg.lastIndexOf(' ')+1);
        String lastWordFind = msg.substring(msg.lastIndexOf(' ')+1);
        // msg.lastIndexOf(' ')+1 => bu 17 demek, 17.karakterden sonraki herseyi getir!!
        //System.out.println(lastWordFind);
        //QAEngineering
        //reverseMsg = 'Q' + "" = "Q"
        //reverseMsg = 'A' + "Q" = "AQ"
        //reverseMsg = 'E' + "AQ" = "EAQ"
        //for dongusu incremental olarak kullanildi yani (i)
        for (int i=0; i<lastWordFind.length(); ++i) {
            reverseMsg =lastWordFind.charAt(i) + reverseMsg ;  // reverseMsg i koydugumuz yer onemli!!!
        }
        System.out.println( qa+ reverseMsg); //QA Engineering

        reverseMsg=""; // reverseMsg i tekrar bosaltikki alttaki for nasil calisiyor gorelim
        //for dongusu decremental olarak kullanildi yani (i--)
        for (int i=lastWordFind.length()-1; i>=0; --i) {
            reverseMsg =reverseMsg + lastWordFind.charAt(i);  // reverseMsg i koydugumuz yer onemli!!!
        }
        System.out.println( qa+ reverseMsg); //QA Engineering
    }
}
