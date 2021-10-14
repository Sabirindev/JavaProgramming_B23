package day_60_Functionalinterface_LambdaExpressions_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPractices {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list = list.stream().map(p -> (p % 2 != 0) ? p * 2 : p * 3).collect(Collectors.toList());
        System.out.println("list = " + list);

        System.out.println("/n****************************************************");
        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        days = days.stream().map(p -> p.substring(0, 3)).collect(Collectors.toList());
        System.out.println("days = " + days);

        System.out.println("/n****************************************************");
        List<String> names = new ArrayList<>(Arrays.asList("Java", "pytohon", "ruby", "c#", "c++"));
        names = names.stream().map(p -> p.toUpperCase()).collect(Collectors.toList());
        System.out.println("names = " + names);

        System.out.println("/n****************************************************");

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        nums2 = nums2.stream().distinct().collect(Collectors.toList());
        System.out.println("nums2 = " + nums2);

        System.out.println("/n****************************************************");

        Integer[] arr = {1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6};
        arr = Arrays.stream(arr).distinct().collect(Collectors.toList()).toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));

        System.out.println("/n****************************************************");

        List<Integer> nums3 = new ArrayList<>(Arrays.asList(1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        nums3 = nums3.stream().distinct().filter(p -> p > 5).collect(Collectors.toList());
        System.out.println("nums3 = " + nums3);

        System.out.println("/n************************************************************");
        List<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Sabir Mustafayev","Jimmy Jon","John Daniel","James Bond","Breanna King","Shay King","Josh Bryan"));
        System.out.println(students);

        students = students.stream().map(p->p.charAt(0)+"."+p.charAt(p.indexOf(" ")+1)).collect(Collectors.toList());
        System.out.println("students = " + students);


    }

}
