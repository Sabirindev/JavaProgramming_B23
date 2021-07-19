package day25_Arrays_forEachLoop;

public class UniqueCharElementsInArray {
    public static void main(String[] args) {
        char chars[] = {'A','B','A','C','A','D','D'};

        for (char eachChar : chars) {
            int count =0;
            for (char character : chars) {
                if (character == eachChar){
                    count++;
                }
            }
            if (count ==1){

                System.out.println(eachChar);
            }
        }
    }
}
