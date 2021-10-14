package day_60_Functionalinterface_LambdaExpressions_Stream;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class BuildInFunctionalInterfaces2 {
    public static void main(String[] args) {

        //create a function that can reverse  STRING
        Function<String,String> reverse = str -> new StringBuilder(str).reverse().toString();
        String r1 = reverse.apply("Wooden Spoon");

        //create a function that can check if the string is polindrome
        Function<String, Boolean> isPalindrome = str -> {
            String r = reverse.apply(str);
            return str.equalsIgnoreCase(r);
        };
        boolean r2 = isPalindrome.apply("Anna");
        System.out.println("r2 = " + r2);

        //create a function that can return maximum number from array of integers
        Function<Integer[],Integer> maxNumFromArray = arr -> {
            Arrays.sort(arr);
            return arr[arr.length-1];
        };

        Integer[] arr = {1,2,3,4,5,6};
        int maxNumFromArr = maxNumFromArray.apply(arr);
        System.out.println("maxNumFromArr = " + maxNumFromArr);

        //create  a function that can return maximum number from arraylist of Integers
        Function<ArrayList<Integer>,Integer> maxNumFromArrayList = list ->{
            Collections.sort(list);
            return list.get(list.size()-1);
        };
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int maxNumFromarrayList  = maxNumFromArrayList.apply(list);
        System.out.println("maxNumFromArrayList = " + maxNumFromArrayList);

        System.out.println("/n*************************************************");
        //forEach()
        Map<String,Integer> map =new LinkedHashMap<>();
        map.put("John", 95000);
        map.put("Jimmy", 10000);
        map.put("Josh", 105000);
        map.put("Daniel", 120000);
        map.put("Turgay", 135000);

        map.forEach((k,v) ->System.out.println(k+" : "+v));
        System.out.println("******************************************");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println("/n*************************************************");
        //create a function that can repeat the given string for the given number of times
        BiConsumer<String,Integer> printMultipleTimes = (s,n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }
        };
        printMultipleTimes.accept("Java",10);


    }
}
