package day11_Switch;

public class PassOrFail {
    public static void main(String[] args) {

        char grade = 'm';
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
            default:
                System.out.println("default");
        }
        System.out.println(result);
    }
}
