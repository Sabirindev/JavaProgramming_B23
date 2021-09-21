package IV.String;

import java.util.Scanner;

public class PrintMiddleThreeCharsOfString_substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int MidIndexNum = word.length() / 2;
        String result = "";
        if (word.length() >= 5 && word.length() % 2 != 0) {
            result += word.substring(MidIndexNum - 1, MidIndexNum + 2);
        } else {
            result = "invalid";
        }
        System.out.println(result);
        scan.close();
    }
}
/*
Given a String variable **word** print the middle three characters if the word is an odd number of characters and has more than 5 characters. If the word does not meet the requirements print invalid.
```
fifteen ==> fte
```

```
apple ==> ppl
```

```
hey ==> invalid
```

```
java ==> invalid
```

```
whatsup ==> ats
```

```
$ ==> invalid
 */
