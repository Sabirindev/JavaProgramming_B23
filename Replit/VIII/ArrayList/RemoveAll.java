package VIII.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveAll {
    public static ArrayList<String> removeAll(ArrayList<String> wordList, String targetWord){
        //ArrayList<String> result = new ArrayList<>();

        wordList.removeAll(Arrays.asList(targetWord));
        return wordList;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String target = in.next();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }
        System.out.println(removeAll(list, target));

    }
}
/*
Create a static method that:
is called removeAll
returns ArrayList<String>
takes two parameters: an ArrayList of Strings called wordList, and a String called targetWord

This method should go through every element of wordList and remove every instance of targetWord from the ArrayList.

Example:
ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
removeAll(wordList,"hi");
wordList: ["hey","yo"]

 */
