package day06_UnaryOperators;

public class Unary_Operators {
    public static void main(String[] args) {
         int a = 100;

         ++a;

        System.out.println("a = " + a);

        int b = 100;
        --b;

        System.out.println("b= "+ b);

        System.out.println("**********************************");
        int d = 100;
             System.out.println(d++); //100 first it prints d's value 100, then it is increased by 1 then d = 101
        System.out.println("d="+d); // 101

        int e = 100;
             System.out.println(e--); //100 first it prints e's value 100, then it is decreased by 1 then d = 99
        System.out.println("e = "+ e);

        System.out.println("**********************************");
        int x =10;
            System.out.println(x++); // first it prints out x = 10 then it will incread it by 1 then x =11;
        System.out.println(x); // 11

        System.out.println("**********************************");

        int y = 100;
        int result = y++ + 1;
        System.out.println("result = "+result);
        System.out.println("y = "+y);

        System.out.println("**********************************");

        int z = 100;
        int result2 = ++z + 1;

        System.out.println("result2 = "+ result2);
        System.out.println("z = "+ z);

        System.out.println("**********************************");

        int j = 8;
        y = j--;
        System.out.println("y = "+ y);
        System.out.println("j = "+ j);

        System.out.println("**********************************");

        int p = 1;
         p = -p-- + p++ / -p-- * --p;
        System.out.println("p = "+p);

         /*
         p-- => 1
         p++ => 0
         p-- =>1
         --p => -1
         result =>>  -1 + 0 / -1 * -1  =>  -1 + 0 * -1  => -1 + 0 = -1
          */




    }
}
