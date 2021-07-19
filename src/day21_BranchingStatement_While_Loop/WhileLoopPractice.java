package day21_BranchingStatement_While_Loop;

public class WhileLoopPractice {
    public static void main(String[] args) {
        String sentence = "Java Java Java JavaJavJava";
        //              "Java Java Java JavaJavJava"
        //              "Java Java JavaJavJava"
        //              "Java JavaJavJava"
        //              "JavaJavJava"
        //              "JavJava"
        //              "Jav"

        int countJava = 0; //1+1+1+1

        while(sentence.contains("Java")){
            countJava++;
            sentence = sentence.replaceFirst("Java", "");
        }

        System.out.println("countJava = " + countJava);
    }
}
