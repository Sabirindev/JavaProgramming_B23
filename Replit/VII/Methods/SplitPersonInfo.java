package VII.Methods;

import java.util.Scanner;

public class SplitPersonInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        person(str);
        scan.close();
    }
    public static void person(String info){
        String array[] = info.split(",");
        System.out.println("person name: "+array[0]+"\nlast name: "+array[1]+
                "\nage: "+array[2]);
    }
}
/*
The method **person** has a string arguement with this format:
"name,last name,age". Print out the person's information

Example:

output:
person name: jon
last name: doe
age: 30

hint: use the `split` method to split the
string to a string array where there is a "," char
 */
