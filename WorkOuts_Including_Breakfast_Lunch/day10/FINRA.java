package day10;

public class FINRA {
    /*
     Write a function which prints out the number. but for number which is a multiple of 3, print "FIN" instead of the number
    and for number which is a multiple of 5, print "RA" instead of the number. and for number which is a multiple of both 3 and 5,
    print "FINRA" instead of the number.

    if the number is evenly divisible by 3 ONLy then print "FIN"
    if the number is evenly divisible by 5 ONLY then print "RA"
    if the number is even divisible by 3 and 5 both, then print "FINRA"
    otherwise just print the number itself
            ex:
                number = 3

            output:
                FIN

                number = 10

            output:
                RA

                number = 15

            output:
                FINRA
     */
    public static void main(String[] args) {
        int number = 15;

        String name ="";

        if (number%3==0 && number%5==0){
            name = "FINRA";
        }else if (number%3==0){
            name="FIN";
        }else if (number%5==0){
            name="RA";
        }else{
            name=""+number;
        }
        System.out.println(name);
    }
}
