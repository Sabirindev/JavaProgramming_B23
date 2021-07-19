package day17_StringMethods3;

public class String_contains_starts_end {
    public static void main(String[] args) {
        String sentence = "My favorite programming  language are: C#, Java, JavaScript";
        boolean hasPython = sentence.contains("Python");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.toLowerCase().contains("java");

        System.out.println("hasPython = " + hasPython); // false
        System.out.println("hasJava = " + hasJava); //true
        System.out.println("hasJava2 = " + hasJava2); //true

        System.out.println("*********startsWith()***************");
        String sentence2 = "Cybertek School is the best";
        boolean startWithCybertek = sentence2.startsWith("Cybertek"); // true
        boolean startsWithSchool = sentence2.startsWith("School"); // false

        System.out.println("startWithCybertek = " + startWithCybertek);
        System.out.println("startsWithSchool = " + startsWithSchool);


        System.out.println("***********endsWith()**************");

        boolean endsWithBest = sentence2.endsWith( "best" );
        System.out.println("endsWithBest = " + endsWithBest);





    }
}
