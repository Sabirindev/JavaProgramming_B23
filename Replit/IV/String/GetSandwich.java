package IV.String;

import java.util.Scanner;

public class GetSandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next().toLowerCase();

        int indexOffirstBread = str.indexOf("bread");
        int indexOfSecondBread = str.lastIndexOf("bread");

        if (str.contains("bread") && indexOffirstBread != indexOfSecondBread ){

            String firstBread = str.substring(indexOffirstBread,indexOffirstBread+5);
            String strBetween =str.substring(indexOffirstBread+5,indexOfSecondBread);
            System.out.println(strBetween);
        }else{
            System.out.println("nothing");
       }

        scan.close();
    }
}
/*
A sandwich is two pieces of bread with something in between.
 Print the string that is between the first and last appearance of "bread" in the given string,
 or return string "nothing" if there are not two pieces of bread.


Example:

```
input: breadjambread

output: jam
```

```
input: xxbreadjambreadyy

output: jam
```

```
input: xxbreadapple

output: nothing
```

```
input: breadbutterbread

output: butter
 */
