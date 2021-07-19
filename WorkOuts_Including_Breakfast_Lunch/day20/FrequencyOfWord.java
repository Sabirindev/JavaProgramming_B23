package day20;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence = "Java Java Java Java JavaJava";
        //          index: 012345678
        String word = "Java";
        int count = 0;
        // "Java";
        /*
        String str1 = sentence.substring(0, 4); // "Java"
        String str2 = sentence.substring(1, 5); //"ava "
        String str3 =sentence.substring(2, 6); //"va J"
        String str4 = sentence.substring(3, 7); // "a Ja"
         */

        for(int i = 0; i <= sentence.length()-word.length(); i++  ){ //
            String each = sentence.substring(i, i+word.length()); // representing each four characters in sentence
            System.out.println(sentence.substring(i, i+word.length()));
            if(each.equals(word)){
                count++;
            }
        }

        System.out.println("count = " + count);
    }
}
