package IV.String;

import java.util.Scanner;

public class Email1_substring_indexOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String result ="";
        if (email.contains("_")){
            int indexOfUnderScore = email.indexOf("_"),
                    indexOfAt = email.indexOf("@");

            result = email.substring(indexOfUnderScore+1,indexOfAt)
                    +"_"+email.substring(0,indexOfUnderScore)+ email.substring(indexOfAt);
        }else {
            result = email;
        }
        System.out.println(result);
        scan.close();
    }
}
/*
Swap first name with last name in the email (Seperated by an underscore).
 If the email doesn't contain an underscore print the given input email.

Examples:


```
input: mike_tyson@gmail.com

output: tyson_mike@gmail.com
```

```
input: barakobama@gmail.com

output: barakobama@gmail.com
 */
