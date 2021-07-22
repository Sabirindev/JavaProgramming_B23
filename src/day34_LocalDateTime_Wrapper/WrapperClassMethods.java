package day34_LocalDateTime_Wrapper;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str); // int primitive

        int num2 = Integer.valueOf(str); // wrapper class

        System.out.println(num - 1);

        String str2 = "true";

        boolean r1 = Boolean.parseBoolean(str2);//primitive // noneboxing  boolean = boolean
        boolean r2 = Boolean.valueOf(str2);// wrapper, unboxing  boolean = Boolean
        Boolean r3 = Boolean.parseBoolean(str2);// primitive, Autoboxin Boolean = boolean

        String str3 = "2.5";
        double d1 = Double.parseDouble(str3);

        System.out.println("****************************************************");

        char ch = '4';

        boolean isDigit = Character.isDigit(ch);
        System.out.println(isDigit);
        boolean isLetter = Character.isLetter(ch);
        System.out.println(isLetter);
        boolean isSpecialChar = !Character.isLetterOrDigit(ch);
        System.out.println(isSpecialChar);

        System.out.println("*******************************************************");

        String s = "a1b2c3";
        int sum = 0;

        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)){
                sum += Integer.parseInt(""+each);
            }
        }
        System.out.println("sum = "+ sum);

        System.out.println("***********************************************************");

        String s2 = "AAABBBCCC!@#$%#@!$%^&";

        String letters = "",
                digits = "",
                specialChars ="";

        for (char each : s2.toCharArray()) {
            if (Character.isDigit(each)){
                digits += each;
            }else if(Character.isLetter(each)){
                letters += each;
            }else{
                specialChars += each;
            }

        }


        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }

}
