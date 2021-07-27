package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(20,30,20,20,10,15,10,5,0,-1,40,3));
        System.out.println(list);

        System.out.println("***** Collections.sort(CollectionType) ****");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("***** Collections.reverse(CollectionType) ****");
        Collections.reverse(list);
        System.out.println(list);

        System.out.println("***** Collections.swap(CollectionType, index1 int, index2 int) ****");
        Collections.swap(list,1,2);
        System.out.println(list);


        System.out.println("***** Collections.replaceAll(CollectionType, old value, new values) ****");
        Collections.replaceAll(list, 10, 20);
        System.out.println(list);


        System.out.println("***** Collections.frequency(CollectionType, element): returns the frequency of the elements, as int ****");
        int f = Collections.frequency(list, 20);
        System.out.println(f);

        System.out.println("*******************************************************************");
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A', 'A', 'B', 'C', 'C', 'C', 'D'));
        System.out.println(chars);

        /*
        //
        ArrayList<Character> uniques = new ArrayList<>();
        for (Character each : chars) {
            if(Collections.frequency(chars, each) == 1 ){
                uniques.add(each);
            }
        }
         */

        ArrayList<Character> uniques = new ArrayList<>( chars );
        uniques.removeIf( p ->  Collections.frequency(uniques, p ) != 1);
        System.out.println(uniques);

        System.out.println("*******************************************************************");

         /*
        String str = "ABABABCDEEEE";
        String unique = "";
        ArrayList<String> result = new ArrayList<>(  Arrays.asList(str.split("") ) );
        for(String each : result){
            if(Collections.frequency(result, each) == 1){
                unique+= each;
            }
        }
        System.out.println(unique);
         */
        String str = "ABABABCDEEEE";
        System.out.println(str);

        ArrayList<String> result = new ArrayList<>(  Arrays.asList(str.split("") ) );
        result.removeIf(p -> Collections.frequency(result, p) != 1 );

        System.out.println(result);

        System.out.println("******Collections.max() and Collections.min()*********");
        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,10,10, 9, 9, 8, 7, 6,5,4,3,2,1));
        int firstMax = Collections.max(numbers);

        numbers.removeIf( p ->  p ==  Collections.max(numbers));
        int secondMax = Collections.max(numbers);

        numbers.removeIf( p ->  p ==  Collections.max(numbers));
        int thirdMax = Collections.max(numbers);


        System.out.println("firstMax = " + firstMax);
        System.out.println("secondMax = " + secondMax);
        System.out.println("thirdMax = " + thirdMax);

    }
}
