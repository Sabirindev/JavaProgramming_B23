package day57_Collection_RECAP;

import utilities.StringUtility;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemovePolindromeFromListOfString {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.addAll(Arrays.asList("Java", "Python", "Level", "Kayak", "Cybertek", "Zaman", "Ana", "Batch23"));

        Iterator<String> it = list.iterator();//in order toremove from collection, We MUST apply Iterator interface
        while (it.hasNext()) {
            String each = it.next();// getting access to each object
            String reverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }
            if (each.equalsIgnoreCase(reverse)){ //if the string object is polindrome
                it.remove();
            }
        }
        System.out.println("list = " + list);

        System.out.println("\n***********************************************************************");
        List<String> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList("Java", "Python", "Level", "Kayak", "Cybertek", "Zaman", "Ana", "Batch23"));

        list2.removeIf(p -> StringUtility.isPalindrome(p));
        System.out.println("list2 = " + list2);
    }
}
/*
1. write a program that can remove the palindrome string from a list of String
            DO NOT use Lambda expressions
 */
