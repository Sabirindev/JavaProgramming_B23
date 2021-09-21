package operatorsAndDataTypes;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10 , b = 0;
        b = a++;
        System.out.println("int a = 10 , b = 0;\n b = a++; ==> "+ b+" < then a's value increase by one ==>>"+a);
        System.out.println("***********************************************************************************");
        int a1 = 10 , b1 = 0;
        b1 = ++a1;
        System.out.println("int a1 = 10 , b1 = 0;\n b1 = ++a1; "+b1+" a's value is already increased by one ==> "+ b1);

        System.out.println("***********************************************************************************");

        int c = 30;
        System.out.println(c++);
        System.out.println("c = "+ c );

        System.out.println("***********************************************************************************");

        int d = 30;
        System.out.println(++d);
        System.out.println("d = "+ d );

        System.out.println("***********************************************************************************");

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
