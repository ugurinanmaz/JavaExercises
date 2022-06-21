package ReCap_CampusClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Day26_MultiDimensionalArrayList {

    public static void main(String[] args) {

        int[][] array2D = new int[3][2];
        array2D[0][0] = 44;
        array2D[0][1] = 4;
        array2D[1][0] = 12;
        array2D[1][1] = 25;
        array2D[2][0] = 34;
        array2D[2][1] = 47;

        System.out.println(Arrays.deepToString(array2D));

        /***********************MULTI DIMENSIONAL ARRAYLIST*****************************************/

        ArrayList<ArrayList<String>> sodaTruck = new ArrayList<>();

        ArrayList<String> cocaCola = new ArrayList<>();
        Collections.addAll(cocaCola, "Diet Coke","Zero Coke", "Vanilla Coke");
/*        cocaCola.add("Diet Coke");
        cocaCola.add("Zero Coke");
        cocaCola.add("Vanilla Coke");*/
        ArrayList<String> uludag = new ArrayList<>();
        Collections.addAll(uludag, "gazoz","mineral water", "sari kola");

        ArrayList<String> pepsi = new ArrayList<>();
        Collections.addAll(pepsi, "Coke","Zero", "Diet");

        ArrayList<String> leCola = new ArrayList<>();
        Collections.addAll(leCola, "Coke","Zero", "Diet");

        Collections.addAll(sodaTruck, cocaCola,uludag,pepsi,leCola);

        System.out.println(sodaTruck);

        System.out.println(sodaTruck.get(1));

        ArrayList<String> products = new ArrayList<>();
        Collections.addAll(products, "CocaCola", "Uludag", "Pepsi","LeCola");

        for (int i = 0; i <sodaTruck.size(); i++) {
            System.out.println(products.get(i) + " = " + sodaTruck.get(i));
        }

        for (int i = 0; i < products.size(); i++) {

            System.out.println();
            System.out.print(products.get(i) + " = " );

            for (int j = 0; j < sodaTruck.get(i).size(); j++) {

                System.out.print((sodaTruck.get(i)).get(j) + " - ");

            }

        }

    }

}
