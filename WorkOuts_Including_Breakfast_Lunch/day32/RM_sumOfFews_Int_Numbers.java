package day32;


import java.sql.SQLOutput;

public class RM_sumOfFews_Int_Numbers {
    public static void main(String[] args) {
        int sum2 = sumOf2Numbers(10,15);
        int sum3 = sumOf3Numbers(15,25,35);
        int sum4 = sumOf4Numbers(10,20,30,40);

        System.out.println("****************** Method Overloading sum(); **************");
        int sum5 = sum(10,15);
        int sum6 = sum(100,200,300);
        int sum7 = sum(1000,2000,3000,4000);

//        int totalOfNumbers = 0;
//        for (int i = 1; i <=100; i+=2) {
//            totalOfNumbers += sum(i,i+1);
//        }
//        System.out.println(totalOfNumbers);

        // 10.5, 20.5
        double r4 = sum(10.5, 20.5);

        // 2.5, 3.2, 4.8
        //  sum( (int)2.5, (int)3.2, (int)4.8  );
        //    2           3       4

        double r5 = sum(2.5, 3.2, 4.8);

        //5.5, 10.5, 3.5, 20.5
        double r6 = sum(5.5, 10.5, 3.5, 20.5);

        System.out.println("r4 = " + r4);
        System.out.println("r5 = " + r5);
        System.out.println("r6 = " + r6);

    }


    // 1. create a method that can find the sum of two numbers
//                    method name: sumOf2Numbers
    public static int sumOf2Numbers(int a, int b) { return a + b;}

    //2.create a method that can find the sum of three numbers
    //                method name: sumOf3Numbers
    public static int sumOf3Numbers(int a, int b, int c) {return a + b + c;
    }

    //3. create a method that can find the sum of four numbers
    //                    method name: sumOf4Numbers
    public static int sumOf4Numbers(int a, int b, int c, int d) {return a + b + c + d;
    }

    //******************** Method OverLoading *****************************
    //Method name must be same, DataType of Parameters must be different for creating Method Overloadin
    public static int sum(int a,int b){return  a + b;}
    public static int sum(int a, int b, int c){return a+b+c;}
    public static int sum(int a, int b, int c, int d){
        //  return sum(a,b) + sum(c, d);
        //   return  sum(  sum(a, b) ,   sum(c, d)  );
        //   sum (       3,             7         )
        //  10

        //    return  sum(a,b,c) + d;
        return a + b + c + d;
    }
    public static double sum(double a, double b){ return a +b;}
    public static double sum(double a, double b, double c){ return a +b + c;}
    public static double sum(double a, double b, double c,double d){return a +b+c+d;}

}

