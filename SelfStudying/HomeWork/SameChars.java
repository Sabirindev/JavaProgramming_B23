package HomeWork;

public class SameChars {
    public static void main(String[] args) {
         /*
        Task 3 : Write a program that accepts String array.Count how many names have the same first and last letter
				Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"
				Output : 4
         */

        /*
        String first=names[i].substring(0,1);
       String last =names[i].substring(names[i].length-1);
         */

        String[] names={"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya","sabbaas",
                "sasas","saeeees","ssshhhhhs"};

        String longestOne="";

        int counter=0;

        for (int i = 0; i <names.length ; i++) {


            String firstLetter=names[i].substring(0,1);
            String lastLetter =names[i].substring(names[i].length()-1);

            if(firstLetter.equalsIgnoreCase(lastLetter) && names[i].length()>longestOne.length()){
                longestOne=names[i];
                counter++;
            }

        }

        System.out.println(counter);

        System.out.println("longestOne = " + longestOne+"\nsize of "+longestOne+": "+longestOne.length());

    }
}
