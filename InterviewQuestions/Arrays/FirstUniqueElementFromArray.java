package Arrays;

public class FirstUniqueElementFromArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4};
        int firstUniqueElement = 0;


        System.out.println("************* For Loop to find \'first Unique Element\' ******************************");
        for (int j = 0; j <nums.length; j++) {// outer loop: resposible for repeating the inner loop to
                                            // find frequency of each element
            int frequency = 0;
            for (int i = 0; i < nums.length; i++) {//inner loop: responsible for finding the frequecy of one element
                if (nums[i] == nums[j]) {
                    frequency++;
                }
            }
            if(frequency == 1){
                firstUniqueElement = nums[j];
                break;
            }
        }
        System.out.println(firstUniqueElement);

        System.out.println("************* ForEach Loop to find \'first Unique Element\'**************************");
        for(int each  : nums ) {// outer loop: responsible for repeating the inner loop to find frequency of each element

            int frequency = 0;
            for (int element : nums) {  // inner loop: responsible for finding the frequency of one element
                if (element == each) {
                    frequency++;
                }
            }

            if(frequency == 1){ // if element is unique: 2, 4
                firstUniqueElement = each;
                break;  // to make sure only the first unique element is returned from the loop
            }

        }
        System.out.println(firstUniqueElement);

    }
}
/*
write a program that can return the first unique element
from the array

example:

array:{1,2,1,3,3,4,5,5,5,6,6,6,7,7,7,8}
output:
2
 */
