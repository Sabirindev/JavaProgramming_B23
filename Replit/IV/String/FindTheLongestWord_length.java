package IV.String;

import java.util.Scanner;

public class FindTheLongestWord_length {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        String result ="";
        if (word1.length() != word2.length()){
            if (word1.length() > word2.length()){
                result = word1;
            }else {
                result = word2;
            }
        }else{
            result = "Please enter other words";
        }
        System.out.println(result);
    }
}
/*
Write a program that will print out the longest word.
Note: Assume the length of the two given Strings will be different

```
input:
bill
check

```
```
output: check
 */