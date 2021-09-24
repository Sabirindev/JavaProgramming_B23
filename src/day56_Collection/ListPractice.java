package day56_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class ListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("arrayList.size() = " + arrayList.size());


        Vector<Integer> vector = new Vector<>();
        System.out.println("vector.size() = " + vector.size());


        Stack<Integer> stack = new Stack<>();
        stack.addAll( Arrays.asList(1,2,3,4,5,6)  );

        System.out.println(stack);

        int a = stack.pop(); //6

        System.out.println(stack);

        stack.add(a);

        int a2 = stack.pop(); //5

        System.out.println(stack);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack);

        /*
        System.out.println("a = " + a);
        System.out.println("a2 = " + a2);
    */


    }

    public void method1(){

    }

    public synchronized void method2(){

    }

}
