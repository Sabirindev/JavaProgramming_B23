package day10_If_Nested_If_Ternary_Statements;

public class TernaryGrading {
    public static void main(String[] args) {
        int score = 98;
        char grade = ' ';
        grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';

        System.out.println(grade);
    }
}
