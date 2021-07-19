package day11_Switch;

public class OrLogicInSwitch {
    public static void main(String[] args) {
        int number = 10;
        /*
        28 days: 2
        30 days: 4,6,9,11
        31 days: 1,3,5,7,8,10,12
         */
        String result = "";

        switch (number){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = "31 days";
                break;

            case 2: result = "28 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = "30 days";
                break;

        }
        System.out.println(result);
    }
}
