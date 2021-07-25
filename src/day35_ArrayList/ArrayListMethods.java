package day35_ArrayList;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {

        System.out.println("********** add(Object) method ******************");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Eggs");    // 0
        groceryList.add("Milk");    // 1
        groceryList.add("Water");   // 2
        groceryList.add("Viniger"); // 3
        groceryList.add("Bread");   // 4

                             // index         0     1     2       3        4
        System.out.println(groceryList); //[Eggs, Milk, Water, Viniger, Bread]


        System.out.println("\n*** add(index, Object): adds the element to the given index (index must be exist) ******\n");

        groceryList.add(2,"Soda");
                            // index         0     1     2       3        4     5
        System.out.println(groceryList); //[Eggs, Milk, Soda, Water, Viniger, Bread]

        System.out.println("\n****** set(index, Object): replaces the old element at given index with new element ********\n");

        groceryList.set(0, "Toilet Paper");
        groceryList.set(3, "Ayran");
                               // index            0          1     2     3      4        5
        System.out.println(groceryList);   //[Toilet Paper, Milk, Soda, Ayran, Viniger, Bread]

        boolean hasToiletPaper = groceryList.contains("Toilet Paper");
        boolean hasToiletPaper2 = groceryList.indexOf("Toilet Pape") >=0 ;

        System.out.println("hasToiletPaper = " + hasToiletPaper);
        System.out.println("hasToiletPaper2 = " + hasToiletPaper2);


        System.out.println("\n********* remove(index): removes the object at the given index ***********\n");
        //remove(index)
        groceryList.remove(1); // 1, Milk
                            //index                          0         1     2      3        4
        System.out.println(groceryList.toString()); //[Toilet Paper, Soda, Ayran, Viniger, Bread]

        //remove(object)
        System.out.println("\n********* remove(object): removes the first matching object ***********\n");
        boolean r1 = groceryList.remove("Water"); // false, because there is no object "Water" in the list
        System.out.println(groceryList);
        System.out.println("r1 = " + r1);


        boolean r2 = groceryList.remove("Face Masks");
        System.out.println(groceryList);
        System.out.println("r2 = " + r2);

        System.out.println("********** new ArrayList is created *********************");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10); //0
        list1.add(20);//1
        list1.add(30);//2
        list1.add(40);//3
        list1.add(50);//4

        System.out.println("\n********* remove(object): removes the first matching object ***********\n");

        System.out.println(list1);

        Integer a = 30;
        list1.remove(a); // a is object here, that is why it is gonna remove first obejct matching with 30
        System.out.println(list1);

        System.out.println("\n******** 50 is object here, not index number because valueOf returns wrapper class value is object ****");
        list1.remove(Integer.valueOf(50));
        System.out.println(list1);

        System.out.println("\n****** add(index, Object): adds the element to the given index (index must be exist) ******\n");

        list1.add(1, 3);
        System.out.println(list1); //[10, 3, 20, 40]
        list1.remove((Integer) 3); //this is gonna remove object named 3, not the index number 3 (40)
        System.out.println(list1);

        System.out.println("\n****** clear(): removes all the objects from the List *******\n");

        groceryList.clear();
        System.out.println("gorceryList = " + groceryList);

        list1.clear();
        System.out.println("list1 = " + list1);

        System.out.println("****************** list ArrayList is created *****************************");

        ArrayList<Character> list = new ArrayList<Character>();
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('B');
        list.add('A');
        list.add('D');
        list.add('C');

        System.out.println(list);

        System.out.println("******* indexOf(Object): returns the first matching object' index number (int)*********");


        list.indexOf('A');//0
        list.lastIndexOf('B');//3

        System.out.println(list.indexOf('A'));// 0 bc A is the first object of List
        System.out.println(list.indexOf('Z'));  // -1 because there is no Z in the list

        System.out.println("**** unique charachters from list ArrayList******");
        System.out.println("******* lastIndexOf(object): returns the last matching object' index number**********");


        ArrayList<Character> uniqueChars = new ArrayList<>();

        for (Character each : list) {
            if (list.indexOf(each) == list.lastIndexOf(each)) {
                uniqueChars.add(each);
            }
        }
        System.out.println(uniqueChars);

        System.out.println("**************************************************************");
        ArrayList<Character> characters = new ArrayList<Character>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('B');
        characters.add('A');
        characters.add('C');
        characters.add('C');

        System.out.println(characters);

        System.out.println("********* remove dublicated chars *************");

        ArrayList<Character> result = new ArrayList<>(); //[A, B, C]

        System.out.println("**** contains(Object): checks if the object is contained in the list ***");

        for (int i = 0; i < characters.size(); i++) {
            if (!result.contains(characters.get(i))) {
                result.add(characters.get(i));
            }
        }
        System.out.println("result = " + result);

        System.out.println("************** Reversing ArrayList *********************");

        ArrayList<Integer>  nums = new ArrayList<>();

        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);

        System.out.println(nums);

        ArrayList<Integer> result2 = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            result2.add(nums.get((nums.size()-1)-i));
        }

        System.out.println(result2); //reversing result

        System.out.println("************** equals(list): returns boolean ****************************");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(10);
        n2.add(20);
        ;

        System.out.println(n1 == n2); // false
        System.out.println(n1.equals(n2)); // true



    }
}
