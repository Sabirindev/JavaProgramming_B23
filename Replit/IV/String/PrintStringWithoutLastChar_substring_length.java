package IV.String;

import java.util.Scanner;

public class PrintStringWithoutLastChar_substring_length {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String txt = scan.next();

        String result ="";
         result = txt.substring(0,txt.length()-1);
        System.out.println(result);
        scan.close();
    }
}
/*
Given a String **txt** print the value without the last letter

Ex:

```
Input:
foo
```
```
Output:
fo
```

```
Input:
run
```
```
Output:
ru
```

Hint: Use substring() and length()
 */
