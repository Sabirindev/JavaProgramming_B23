package day10_If_Nested_If_Ternary_Statements;

public class TernaryPosNegZero {
    public static void main(String[] args) {
        int num = 25;
        String result = "";

        result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println(result);
    }
}
