package day26_MutilDimensionalArray;

public class MultiDimensionalStringArray {
    public static void main(String[] args) {
       /*
        String[] group5 = {"Ahmed", "Ahmet", "Igor", "Andrei", "Mykyta"},
                group2 = {"Sabir", "Abbos", "Kseniia", "Vitalii", "Merve", "Atila", "Shokhzod", "Hende", "Serife", "Collins", "Akangankoy", "Liubov"},
                group3 = {"Oz", "Ibrahim", "Davut", "Dontrell", "Muahmmed"},
                group4 = {"Inesa","Aysu","Suat","Esra","Yusuf","Mohamed","Tinbite","Raphael"},
                group1 = {"Selda", "Ibrahim", "Tamerlan",  "Mehmut", "Sina"};
        */
        String[][] cybertekGroups = {
                {"Ahmed", "Ahmet", "Igor", "Andrei", "Mykyta"},
                {"Sabir", "Abbos", "Kseniia", "Vitalii", "Merve", "Atila", "Shokhzod", "Hende", "Serife", "Collins", "Akangankoy", "Liubov"},
                {"Oz", "Ibrahim", "Davut", "Dontrell", "Muahmmed"},
                {"Inesa","Aysu","Suat","Esra","Yusuf","Mohamed","Tinbite","Raphael","Ahmed"},
                {"Selda", "Ibrahim", "Tamerlan",  "Mehmut", "Sina","Ahmed"}
        };
        
        int count = 0;
        String name ="";

        for (String[] eachGroup : cybertekGroups) {
            for (String eachName : eachGroup) {
                if (eachName.equals("Ahmed")){
                    count++;
                    name = eachName;
                }
            }
        }
        System.out.println(count+", "+name);

        System.out.println("**********************************************");

        String[][][][][] names = { {  {{{"Viktoria", "Feruza"},{"Koray", "Break"} },
                {{"Komiljon", "Yasin"}}}   , { {{"Alexandra", "Merve"}, {"Zaur", "Vulkasin"} }}} };


        for (String[][][][] each4D : names) {
            for (String[][][] each3D : each4D) {
                for (String[][] each2D : each3D) {
                    for (String[] each1D : each2D) {
                        for (String element : each1D) {

                            System.out.println(element);

                        }
                    }

                }
            }

        }


    }
}
