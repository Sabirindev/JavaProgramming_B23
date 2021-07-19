package day20_BranchingStatements_Break_Continue;

public class FindNumOfFrequencyOfGivenWordInSentence_for_equals {
    public static void main(String[] args) {
        String sentence = "I love books";//, I purchased a lot of books books books books books"; // "book"
        //                 0123456789....
        String word= "book";
        //            0123

        int count = 0;

        for(int i =0; i <= sentence.length()- word.length(); i++){
            String each = sentence.substring(i, i+word.length()); // 8, 8 + 4
            if(each.equals(word)){ // if the word "book" is occured in each variable
                count++;  // increase the count by 1
            }
            System.out.println(each);
        }

        System.out.println("count = " + count);

    }
}
/*
2. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2
 */
