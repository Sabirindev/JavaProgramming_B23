package day_60_Functionalinterface_LambdaExpressions_Stream;


import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterfaces3 {
    public static void main(String[] args) {
        //create a function for anagram strings
        BiPredicate<String, String> anagram = (f, s) -> {
            char[] ch1 = f.toCharArray();
            char[] ch2 = s.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            return Arrays.equals(ch1, ch2);
        };

        boolean r1 = anagram.test("abc", "cab");
        System.out.println("r1 = " + r1);

        System.out.println("/n***************************************");

        // arr = {1,2,3},3
        BiPredicate<int[], Integer> contains = (arr, n) -> {
            for (Integer each : arr) {
                if (each == n)
                    return true;
            }
            return false;
        };

        int[] arr = {100, 200, 300, 400};
        boolean r2 = contains.test(arr, 100);
        System.out.println("r2 = " + r2);

        System.out.println("/n***************************************");

        //create a function that can merge two integer arrays into arrays
        BiFunction<int[], int[], List<Integer>> mergeArrasIntoList = (a, b) -> {
            List<Integer> list = new ArrayList<>();
            for (int each : a)
                list.add(each);

            for (int each : b)
                list.add(each);


            return list;

        };
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        List<Integer> l = mergeArrasIntoList.apply(arr1, arr2);
        System.out.println("l = " + l);

        System.out.println("/n*********************************");

        BiFunction<List<String>, List<Integer>, Map<String, Integer>> addListsToMap = (a, b) -> {
            Map<String, Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < a.size(); i++) {
                map.put(a.get(i), b.get(i));
            }
            return map;
        };
        List<String> names = new ArrayList<>(Arrays.asList("Josh", "Daniel", "James"));
        List<Integer> salaries = new ArrayList<>(Arrays.asList(100000, 200000, 300000));
        Map<String, Integer> employees = addListsToMap.apply(names, salaries);
        System.out.println(employees);

        System.out.println("/n*********************************");

        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        //nums.forEach(p -> sytem.out.println(p));
        nums.forEach(System.out::println);

    }
}
