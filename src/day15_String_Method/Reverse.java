package day15_String_Method;

public class Reverse {
    public static void main(String[] args) {
        String word ="Sabir",
                //    01234
                result = "";

        if (word.length() > 5 ){
            result = "Too Long";
        }else if (word.length() < 5){
            result = "Too short";
        }else {
            //by concatenation we can reverse the word
//            result += word.charAt(4);
//            result+= word.charAt(3);
//            result += word.charAt(2);
//            result += word.charAt(1);
//            result += word.charAt(0);

            result = ""+word.charAt(4) + word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);

        }
        System.out.println(result);
    }
}
