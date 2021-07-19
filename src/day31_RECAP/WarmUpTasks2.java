package day31_RECAP;

public class WarmUpTasks2 {
    public static void main(String[] args) {
        /*
        2.  write a return method named frequencyOfWord that accepts two parameters: string str and String word, then returns the frequency of word
                Ex:
                    str = "Java java java python python"
                    word = "java";
                    frequencyOfWord(str, word) ==>  3
         */

        String sentence = "Java java java python python";
        String word = "java";

        int count = 0; // 3

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            count++;
        }
        System.out.println(count);

        System.out.println("***************************************");




        String sentence2 = "Cybertek CybertekSchool cybertEK Cybertek school New York";
        String word2 = "Cybertek";

        int n1 = frequencyOfWord(sentence2,word2);
        System.out.println(n1);




    }

    public static int frequencyOfWord(String sentence, String word){
        int count = 0;
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            count++;
        }
        return count;
    }
}

