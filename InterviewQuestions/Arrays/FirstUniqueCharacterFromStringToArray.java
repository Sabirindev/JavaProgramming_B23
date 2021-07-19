package Arrays;

public class FirstUniqueCharacterFromStringToArray {
    public static void main(String[] args) {
        String str = "aaab ccddefggggh"; // b, e, f, h

        // indexOf('a') ==> 0
        //LastInedxOf('a') == > 0

//        for (int i = 0; i < str.length(); i++) {
//        }

        for (char eachChar : str.replace(" ","").toCharArray()) { //eachChar: represents
            // each characters of str,excluding the space
            if (str.indexOf(eachChar) == str.lastIndexOf(eachChar)){ // if the character' first and last index number
                // in string are same, then the character is unique
                System.out.println(eachChar);
                break;


            }
        }
    }
}
