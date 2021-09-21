package VIII.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Add {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

//        names.add("Sabir");
//        names.add("Vitalii");
//        names.add("Abbos");

        names.addAll(Arrays.asList("Ksenii","Elif","Merve"));

        System.out.println(names);

    }
}
/*
We will be manipulating elements of an ArrayList by using List methods.
The first List method we will learn is .add()

The following code will take an ArrayList of Strings called strs and add "Hello" to it.

strs.add("Hello");

The syntax is: arraylistvariable.add(data_to_add);
Add three names (any names) to the ArrayList called names.

 */
