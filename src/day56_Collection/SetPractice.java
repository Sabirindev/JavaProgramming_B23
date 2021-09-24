package day56_Collection;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {

        String[] arr= {"Wooden Spoon","Book","Pen","Phone","Wooden Spoon","Wooden Spoon","Wooden Spoon",
        "Milk","Water","water","car","Car"};

        Set<String> items = new HashSet<>(Arrays.asList(arr));
        items.add(null);

        Set<String> items2 = new LinkedHashSet<>(Arrays.asList(arr));
        items2.add(null);

        Set<String> items3 = new TreeSet<>(Arrays.asList(arr));
        //items3.add(null); tree set does not accept null

        System.out.println("items = " + items);
        System.out.println("items2 = " + items2);
        System.out.println("items3 = " + items3);

        //String str = null;
        //str.equals("Cybertek"); //Exception in thread "main" java.lang.NullPointerException

        System.out.println("/n**********************************************************");
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,1,2,3,4,5,6,1,2,3,4,5));

        System.out.println(list);

        System.out.println("\n***************************************************");

        list = new ArrayList<>(new LinkedHashSet<Integer>(list));
        System.out.println(list);

        System.out.println("\n***************************************************");

        String str1 = "abcabcabcabc";
        str1 = new LinkedHashSet<>(Arrays.asList(str1.split(""))).toString();
        //str1 = new LinkedHashSet<>(Arrays.asList(str1.split(""))).toString().substring(1).replace(", ","");
        System.out.println(str1);

        System.out.println("\n***************************************************");

        Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        //returns the fifth element after removing duplicates
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(nums));
        System.out.println(linkedHashSet);
        System.out.println("(new ArrayList<>(linkedHashSet).get(4) ) = " + (new ArrayList<>(linkedHashSet).get(4)));

        System.out.println("\n**************************************************");

        //"aaaaabbbcccc" ===? "a5b3c4"
        //                    "a b c"
        //                     5 3 4

        String s = "aaaaabbbcccc";
        String result ="";
        for (String ch : new LinkedHashSet<>(Arrays.asList(s.split("")))) {//ch: non- dublicated characters ==> a, b, c
            result += ch + Collections.frequency((Arrays.asList(s.split(""))),ch);
        }

        System.out.println("result = " + result);

    }
}
