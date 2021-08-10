package day41_CustomClass_Constructor;


//import utilities.Data;

import utilities.Data;

import static utilities.Data.str3;
import static utilities.Data.str4;

import static utilities.Data.method3;
import static utilities.Data.method4;


public class ImportStatements {
    public static void main(String[] args) {

        /*
        Data obj1 = new Data();

        System.out.println(obj1.str1);
        System.out.println(obj1.str2);

        System.out.println(Data.str3);
        System.out.println(Data.str4);

         */



        System.out.println("******************************************************");

        System.out.println(Data.str3);
        System.out.println(str4);

        method3();  // if we import the class name so we do not need call static method through the class name
        Data.method4(); // for example we did , we do not need to do this, only static method name is enough


    }
}

/*
class Data{
int a, b;

static int c,d;
}
 */
