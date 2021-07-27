package day36_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8));

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                list.remove(i);
            }
        }

        System.out.println(list);

        System.out.println("********************************************************************");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8));

        System.out.println(list2);

        //  list2.removeIf( each  ->  each < 5  );
        list2.removeIf(each -> each % 2 != 0);

        System.out.println(list2);

        System.out.println("********************************************************************");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmad", "Merve", "Feruza", "Said", "Komiljon", "Selda", "Fhilipp"));
        names.removeIf(p -> p.contains("a"));
        System.out.println(names);

        System.out.println("********************************************************************");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Anna", "RaceCar", "Level", "Sabas", "Pop", "Kayak","Sabir"));
        System.out.println(words);
       words.removeIf(p-> StringUtility.isPalindrome(p)); //if the string is palindrome, then remove it from the arraylist
//        System.out.println(words);

        System.out.println("*********************************************************************");
/*
        for (int j =0; j <= words.size()-1; j++) {
            String reverse = "";
            for(int i = words.get(j).length()-1; i >=0; i--){
                reverse += words.get(j).charAt(i);
            }
            boolean isPalindrome = reverse.equalsIgnoreCase(words.get(j));
            words.removeIf( p -> isPalindrome );
        }*/
        System.out.println(words);
    }

}

