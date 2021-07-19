package IV.String;

import java.util.Scanner;

public class Without_x_X_substring_length_equals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //System.out.println(word.length());

        String result = "";
        if (word.substring(0,1).equals("x") || word.substring(0,1).equals("X")){
            if (word.substring(word.length()-1).equals("x") || word.substring(word.length()-1).equals("X")){
                result = word.substring(1,word.length()-1);
            }else {
                result = word.substring(1);
            }
        }else if (word.substring(word.length()-1).equals("x") || word.substring(word.length()-1).equals("X")){
            result = word.substring(0,word.length()-1);
        }else {
            result = word;
        }
        System.out.println(result);
        scan.close();
    }
}
/*
Given a string word, if the first or last chars are 'x' or 'X',
print the string without those 'x' or 'X' chars,
otherwise print the string unchanged.


Example:

```
input: xHiX

output: Hi
```

```
input: apple

output: apple
```

```
input: xUxL

output: UxL
```

```
input: JavaX

output: Java
 */
