package ReCap_CampusClasses;

import java.util.HashMap;
import java.util.Set;

public class Day26_Map {

    public static void main(String[] args) {

        HashMap<String ,Integer> sodaTruck = new HashMap<>();
        sodaTruck.put("Pepsi",10000);
        sodaTruck.put("CocaCola",9000);
        sodaTruck.put("Fanta",6000);
        sodaTruck.put("LeCola",4000);
        sodaTruck.put("CocaCola",4000);

        System.out.println(sodaTruck);

        sodaTruck.putIfAbsent("LeCola",41000);
        sodaTruck.putIfAbsent("Uludag",14000);
        System.out.println(sodaTruck);

        System.out.println(sodaTruck.get("Fanta"));

        HashMap<Integer,String> school = new HashMap<>();
        school.put(90,"Ugur");
        school.put(97,"Funda");
        school.put(317,"Burcu");
        school.put(66,"Ozan");
        school.put(45,"Cagri");
        school.putIfAbsent(45,"Tugba");

        System.out.println(school.get(66));

        Set<Integer> schoolNo = school.keySet();

        for (Integer students : schoolNo ) {
            System.out.println(students+ " = " + school.get(students));
        }








    }
}
