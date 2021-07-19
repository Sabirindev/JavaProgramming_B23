package day11_Switch;

public class PassOrFail {
    public static void main(String[] args) {
        char grade = 'A';
        String result = "";
        /*
        Pass: A, B , C, D
        Fail: F
         */

        switch (grade){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
                break;
        }
    }
}
