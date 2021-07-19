package day19_ForLoop;

public class RemoveDublicatesFromString {
    public static void main(String[] args) {
        String word = "ababababaABb";
        String result = "";

        word.equalsIgnoreCase(word);
        word = word;

        for (int i = 0; i < word.length() - 1; i++) {
//            if (!result.contains("" + word.charAt(i))) {
//                result += word.charAt(i);
//            }
            if (!result.contains("" + word.charAt(i))) {
                result += word.charAt(i);
            }
        }
        System.out.println(result);
    }
}
