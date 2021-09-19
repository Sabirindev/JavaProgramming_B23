package day40_CustomClass_Statics.statics;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlocks {
   public static int a = 20;



    // public static Excel excelData =

    public static ArrayList<String> list =
            new ArrayList<>(Arrays.asList("A", "B", "C"));



    static { // first to run, ONLY runs one time
        list.addAll(Arrays.asList("D", "E", "F"));
        a = 50;
    }





/*
    public static void main(String[] args) {
        list.addAll(Arrays.asList("A", "B", "C"));
    }
*/

}
