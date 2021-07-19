package IV.String;

import java.util.Scanner;

public class FindMiddleOneOfWord_IfStatement_StringMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");

        String word = scan.next(), result = "";

        //boolean isEven = word.length()%2 == 0;
        boolean isOdd = word.length() % 2 != 0;
        int midIndex = (word.length() / 2);

        if (isOdd) {
            if (word.length() >= 3) {
                result = word.substring(midIndex, midIndex + 1);
            } else {
                for (int i = 0; i < 3; i++) {
                    result += word;
                }
            }
        } else {
            if (word.length() >= 4) {
                result = word.substring(midIndex - 1, midIndex + 1);
            } else {
                for (int i = 0; i < 2; i++) {
                    result += word;
                }
            }
        }
        System.out.println(result);

        scan.close();
    }
}
/*
You have a word, do the following:

1. When word has **odd number of characters and:**

 - **3 or more characters, print middle letter**

      oak ==> a

     javav ==> v
```

- **Single character, print that character 3 times**

```
      # ==> ###
```

```
      q ==> qqq
```

2. When word has **even number of characters and**:

 - **4 or more characters**, print the middle 2 characters

```
     java ==> av
```

```
     apples ==> pl
```

```
     #$%^&* ==> %^
```

 - **2 characters,** print those 2 characters twice

```
      @@ ==>@@@@
```

```
      $$ ==>$$$$
```

```
      hi ==> hihi
 */
