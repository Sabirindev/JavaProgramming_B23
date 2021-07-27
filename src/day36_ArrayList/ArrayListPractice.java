package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));


        //friendly explanation
        int nums[] = {1,2,4,5,8,9,7,2,4}; // primitive "int" type
        Integer nums2[] ={ 1,2,3,4,5,6,7,8,9,10,11,12,13,14};  // None-primiitve "Integer" type Wrapper class)

        //note: ****  addAll() methods only accept Collection value ****

       // numbers.addAll(Arrays.asList(nums)); // array nums type is primitive "int", so
                                             // aslist can not convert primitive to collection,that is why compile error ocures

        numbers.addAll(Arrays.asList(nums2));//array nums2 type is None-primitive "Integer", so
                                             // aslist can  convert None-primitive to collection, that is why compile doesnt occure

        System.out.println(numbers);
    }
}
