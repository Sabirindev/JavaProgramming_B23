package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        System.out.println("***** Bulk Operations: argument MUST be collectionType ************");
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("*** addAll(collectionType): adds collection of elements to the list ******\n");
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println("ArrayList numbers = "+numbers);

        ArrayList<Integer> list = new ArrayList<>();
       // list.addAll(1,2,3,4,5,6,7,8,9);

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println("ArrayList list = "+list);

        System.out.println("\n**** add numbers ArrayList elements to list ArrayList***\n");
        list.addAll(numbers);
        System.out.println("ArrayList list = "+list);

        System.out.println("\n*********** addAll ***********************\n");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Hande","Sabir","Atilla","Kseniia","Vitalii","Abbas","Shokzad","Elif","Merve"));
        System.out.println(students);

        System.out.println("\n*** removeAll(collectionType): removes all the matching elemnts from the arraylist****\n");

        students.removeAll(Arrays.asList("Elif","Sabir","Abbas"));
        System.out.println(students);

        System.out.println("****************************************************");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,2,3,5,46,8,5,2,1,1,1,1,4,76,1,2,5,2,5));
        System.out.println(nums);


        System.out.println("*******removeAll removes all element matching with 1****");
        nums.removeAll(Arrays.asList(1)); // removes all info matching 1
        System.out.println(nums);

        System.out.println("\n***** retianAll(collectionType): removes all the Non-matching elemnts from the arraylist (keep) ******");
        nums.retainAll(Arrays.asList(2)); // removes all info not matching 2
        System.out.println(nums);

        System.out.println("********************** retainAll(collectionType) **************************************");

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Hande","Sabir","Atilla","Kseniia","Vitalii","Abbas","Shokzad","Elif","Merve"));
        System.out.println(employees);

       employees.retainAll(Arrays.asList("Sabir","Shokzad"));
        System.out.println(employees);

        System.out.println("*******************************************************************************************");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Soda","Milk","Wine","Beer","Eggs","Bread","Water","Apple","Cherry"));

        //check if Soda,Wine,Beer all of them are contained in groceryList
        System.out.println("\n**** containsAll(collectionType): checks if all elemnts are contained in the list ****");
        boolean r = groceryList.containsAll(Arrays.asList("Soda","Wine","Beer"));
        System.out.println(groceryList);
        System.out.println(r+ "==> there are \"Soda\",\"Wine\",\"Beer\" in groceryList");






    }

}
