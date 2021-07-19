package day22_do_While_Recap;

public class Winner2020 {
    public static void main(String[] args) {
        String belgium = "Belgium",
                italy = "Italy",
                france = "France",
                portugal ="Portugal",
                winner="",
                result ="";

//        if (winner.equalsIgnoreCase(belgium)){
//            result = belgium+" is winner for Euro Championship2020";
//        }else if (winner.equalsIgnoreCase(italy)){
//            result = italy + " is winner for Euro Championship2020";
//        }else if (winner.equalsIgnoreCase(france)){
//            result = france + " is winner for Euro Championship2020";
//        }else if (winner.equalsIgnoreCase(portugal)){
//            result = portugal + " is winner for Euro Championship2020";
//        }else {
//            result = "Azerbaijan is winner for Euro Championship2020";
//            // this block is gonna be executed only ;)))))
//        }
//        System.out.println(result);
        result = (winner.equalsIgnoreCase(belgium))? belgium+" is winner for Euro Championship2020":
                (winner.equalsIgnoreCase(italy))? italy + " is winner for Euro Championship2020":
                        (winner.equalsIgnoreCase(france))? france + " is winner for Euro Championship2020":
                                (winner.equalsIgnoreCase(portugal))? portugal + " is winner for Euro Championship2020":
              "Azerbaijan is winner for Euro Championship2020"; // This block(else)will be executed only ;))))
                                       // because others' do NOT have any chance ( for comparing i mean winner variable
                                  // does not have any value but "".

        System.out.println(result);
    }
}
