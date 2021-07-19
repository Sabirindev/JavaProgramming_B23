package day19_ForLoop;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabccd";
        //            012345
        //String str = "aabcc";

        String result = "";

        for(int i =0; i<= str.length()-1; i++){
            char ch = str.charAt(i); // a, a, b, c, c
            boolean isUnique =  str.indexOf(ch) == str.lastIndexOf(ch);
            //remove dublicate we write the code to remove which are the more than one..
            // unique is ..about to find which one is already unique in the string ..as you say that almost same ..
            //  if the first and last index numbers of the character are same , then the character is unique

            if(isUnique){ // if the character is unique then added into result variable
                result += ch;
            }
        }
        System.out.println("result = " + result);


    }
}
