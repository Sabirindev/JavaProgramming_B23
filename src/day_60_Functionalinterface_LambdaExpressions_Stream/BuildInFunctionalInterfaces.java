package day_60_Functionalinterface_LambdaExpressions_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BuildInFunctionalInterfaces {
    public static void main(String[] args) {

        //create a funtion that can return check if thenumber is even
        Predicate<Integer> isEven = p -> p%2==0 ? true : false;

        boolean r1 = isEven.test(103);
        System.out.println("r1 = " + r1);

        //create  function that can check if a string is palindrome

//        DataFunction<String> reverseString = str -> new StringBuilder(str).reverse().toString();
//
//        Predicate<String> isPalindrome = p -> reverseString.accept(p).equalsIgnoreCase(p);


        Predicate<String> isPalindrome = p -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };
        boolean r2 = isPalindrome.test("Sabir");
        System.out.println("r2 = " + r2);

        System.out.println("/n***********************************************");
        //removIf(Predicate)

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        /*
        Predicate<Integer> isOdd = p -> {
            if (p%2!=0){
                return true;
            }else {
                return false
            }
        }
        list.removeIf(isOdd);*/
        list.removeIf(p -> p%2!=0?true:false);

        System.out.println("/n*****************************************");
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Level","Josh","Breanna","Shay"));
        //names.removeIf(p -> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p));

        names.removeIf(isPalindrome);
        System.out.println("names = " + names);

        System.out.println("/n**************************************************");

        //create a function that can print the string 2 times
        Consumer<String> printThreeTimes = (str) -> System.out.println(str+str+str);
        printThreeTimes.accept("Sabir");

        System.out.println("/n**************************************************");

        //create a function that can print each characters of a list of String
        Consumer<List<String>> printEach = l ->{
            for (String each : l) {
                System.out.println(each);
            }
        };
        printEach.accept(names);

        System.out.println("/n**************************************************");
        //forEach()

        List<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        number.forEach(n -> System.out.println(n*2));

        System.out.println("/n**************************************************");

        List<String> words =new ArrayList<>();
        words.addAll(Arrays.asList("Java","Java","Python","Cydeo","Wooden spoon","Wooden Spoon"));

        //print each unique elements
        Predicate<String> isUnique = p -> Collections.frequency(words,p) ==1;

        //we can use regular loop or ferEach() method
        words.forEach(p->{if (isUnique.test(p)) System.out.println(p);});

        System.out.println("/n**************************************************");
        //create function that can print array of integers in descending order

        Consumer<int[]> printInDescendingOrder = p -> {
            Arrays.sort(p);

            for (int i = p.length-1; i >= 0; i--) {
                System.out.print(p[i]+" ");
            }
            System.out.println();
        };
        int[] arr = {10,11,9,8,7,12,3,4,5,6,1,100};
        printInDescendingOrder.accept(arr);

        System.out.println("/n**************************************************");
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        nums.forEach(p-> {
            if (p%2!=0) {
                System.out.println(p);
            }
        });




    }
}
