package day39_CustomClass_Statics.carpetTask;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet(),new Carpet()};
        carpets[0].customerOrder(5,2,3.5,true);
        carpets[1].customerOrder(6,3.5,5,false);
        carpets[2].customerOrder(5.5,1,6.5,true);
        carpets[3].customerOrder(4.5,3.5,7.5,true);
        carpets[4].customerOrder(7,2.5,5,false);
        carpets[5].customerOrder(4.6,2,1.5,true);
        carpets[6].customerOrder(5.8,2.5,3.5,false);

        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        // first way for persian carpet
        persianCarpets.addAll(Arrays.asList(carpets));//adding all carpets into persianCarpets
        persianCarpets.removeIf(carpet -> !carpet.isPersian);//remove all the carpet if they are not Persian(!isPersian)

        ArrayList<Carpet> regularCarpets = new ArrayList<>();
        //first way for regular carpet
        regularCarpets.addAll(Arrays.asList(carpets));//adding all carpets into regularCarpets
        regularCarpets.removeIf(carpet -> carpet.isPersian);//remove all the carpet if they are  Persian(isPersian)


       /*
        // second way
        for (Carpet eachCarpet : carpets) {
            if (eachCarpet.isPersian){
                persianCarpets.add(eachCarpet);
            }else {
                regularCarpets.add(eachCarpet);
            }
        }
        */

        System.out.println("Total number of Persian Carpets : "+ persianCarpets.size());
        for (Carpet eachPersianCarpet : persianCarpets) {
            System.out.println(eachPersianCarpet);
        }

        System.out.println("Total number of Regular Carpets : "+ regularCarpets.size());
        for (Carpet eachRegularCarpet : regularCarpets) {
            System.out.println(eachRegularCarpet);
        }
    }
}
