package day08_IfStatements;

import javax.xml.bind.SchemaOutputResolver;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int score = 90;
        boolean passed = score >= 60;

        if (passed) { // if student passed the exam

            System.out.println("Congrats you passed the exam");
        }

        if (!passed){
            System.out.println("You failed the exam");
        }
    }
}
