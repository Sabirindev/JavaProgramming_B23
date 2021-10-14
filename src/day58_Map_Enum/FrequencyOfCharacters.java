package day58_Map_Enum;

import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aaabbbcccccddddddd";
        Map<String,Integer> frequencyOfChars = new LinkedHashMap<>();

        for (String each : str.split("")) {
            frequencyOfChars.put(each, Collections.frequency(Arrays.asList(str.split("")),each));
        }

        System.out.println("frequencyOfChars = " + frequencyOfChars);

        System.out.println("/n********************************************");
        ArrayList<Integer> list = new ArrayList<>(frequencyOfChars.values());
        Collections.sort(list);
        int second = list.get(list.size()-2);

        System.out.println("second = " + second);

        System.out.println("/n********************************************");
        //find the character that has the second largest character:
        for (Map.Entry<String, Integer> entry : frequencyOfChars.entrySet()) {
            if (entry.getValue()==second){
                System.out.println(entry.getKey());
            }
        }


    }
}
