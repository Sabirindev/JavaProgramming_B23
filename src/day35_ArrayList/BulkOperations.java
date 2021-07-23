package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        ArrayList<Integer> list = new ArrayList<>();
       // list.addAll(1,2,3,4,5,6,7,8,9);
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list);
        list.addAll(numbers);
        System.out.println(list);

        System.out.println("*************************************");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Hande","Sabir","Atilla","Kseniia","Vitalii","Abbas","Shokzad","Elif","Merve"));

        System.out.println(students);
        students.removeAll(Arrays.asList("Elif","Sabir","Abbas"));
        System.out.println(students);

        System.out.println("****************************************************");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,2,3,5,46,8,5,2,1,1,1,1,4,76,1,2,5,2,5));
        System.out.println(nums);

        nums.removeAll(Arrays.asList(1)); // removes all info matching 1
        System.out.println(nums);
        nums.retainAll(Arrays.asList(2)); // removes all info not matching 2
        System.out.println(nums);

        System.out.println("*********************************************************************************");

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Hande","Sabir","Atilla","Kseniia","Vitalii","Abbas","Shokzad","Elif","Merve"));
        System.out.println(employees);

       employees.retainAll(Arrays.asList("Sabir","Shokzad"));
        System.out.println(employees);

        System.out.println("*******************************************************************************************");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Soda","Milk","Wine","Beer","Eggs","Bread","Water","Apple","Cherry"));

        //check if Soda,Wine,Beer all of them are contained in groceryList
        boolean r = groceryList.containsAll(Arrays.asList("Soda","Wine","Beer"));
        System.out.println(groceryList);
        System.out.println(r+ "==> there are \"Soda\",\"Wine\",\"Beer\" in groceryList");






    }

}
