package day25_Arrays_forEachLoop;

public class ForEachLoop {
    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,5}; // 5 -1 = 4, 0,1,2,3,4
//                                                  // 0,1,2,3,4,5
//        // index         0 1 2 3 4
//
//        System.out.println("************* For Loop ***************************");
//        for (int i = 0; i < numbers.length-1; i++) {
//            System.out.println(numbers[i]);
//        }
//
//        System.out.println("***************** ForEachLoop ***************************");
//
//        for (int each:numbers){
//            System.out.println(each);
//        }

        System.out.println("***********************************************");

        String[] names = {"Ahmet","Boburbek","Farid","Robinson"};

        for (String eachName:names){
            System.out.println(eachName);
        }

    }
}
