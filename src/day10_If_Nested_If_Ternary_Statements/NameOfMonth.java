package day10_If_Nested_If_Ternary_Statements;

public class NameOfMonth {
    public static void main(String[] args) {
        int number = 12; // 1 ~ 12

        String name = "";

        if (number==1){
            name = "January";
        }else if (number==2){
            name="February";
        }else if (number==3){
            name="March";
        }else if (number==4){
            name="April";
        }else if (number==5){
            name="May";
        }else if (number==6){
            name="June";
        }else if (number==7){
            name="July";
        }else if (number==8){
            name="August";
        }else if (number==9){
            name="September";
        }else if (number==10){
            name="October";
        }else if (number==11){
            name="November";
        }else{
            name = "December";
        }
        System.out.println(name);
    }
}
