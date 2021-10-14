package day58_Map_Enum;

import java.util.*;

public class MapIntro {
    public static void main(String[] args) {

        Map<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("Selda", 100000);
        employeeMap.put("Sabir", 165000);
        employeeMap.put("Selda", 185000);// there are 2 Key (Selda) last assigned one will be placed with previous one.
        employeeMap.put("Vitalii", 200000);

        System.out.println("employeeMap = " + employeeMap);
        System.out.println(employeeMap.size());

        Map<String, String> scrum1 = new LinkedHashMap<>();
        scrum1.put("Product Owner", "Kseniia");
        scrum1.put("Scrum Master", "Atilla");
        scrum1.put("Developer1", "Vitalii");
        scrum1.put("Developer2", "Abbos");
        scrum1.put("Developer3", "Hande");
        scrum1.put("SDET1", "Abbas");
        scrum1.put("SDET2","Sabir");
        scrum1.put("SDET3", "Marina");
        scrum1.put("SDET4", "Elif");
        scrum1.put("SDET5", "Farid");

        System.out.println("employeePosition = " + scrum1);

        scrum1.remove("BA");


        System.out.println("employeePosition = " + scrum1);

        System.out.println("/n********************************************************");

        boolean r1 = employeeMap.containsKey("Sabir");//true
        boolean r2 = employeeMap.containsKey("Selda");//true
        boolean r3 = employeeMap.containsKey("selda");//false

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("/n********************************************************");

        boolean r4= employeeMap.containsValue(165000);//true
        boolean r5= employeeMap.containsValue(300000);//flase

        System.out.println("r4 = " + r4);
        System.out.println("r5 = " + r5);

        System.out.println("/n********************************************************");

        System.out.println("employeeMap = " + employeeMap);

        employeeMap.replace("Selda",250000);
        employeeMap.replace("Vitalii",employeeMap.get("Vitalii")+10000);
        System.out.println("employeeMap = " + employeeMap);

        System.out.println("/n********************************************************");

        for (String eachName : employeeMap.keySet()) {
            System.out.println(eachName+" : "+ employeeMap.get(eachName));
        }

        System.out.println("/n******************************");

        //List<String> list = new ArrayList<>();
        Set<String> set = employeeMap.keySet();

        System.out.println("set = " + set);

        System.out.println("/n******************************");

        employeeMap.put("Abbos", 115000);
        employeeMap.put("Yuliang", 120000);
        employeeMap.put("Feruza", 125000);
        employeeMap.put("Ahmet", 129000);
        employeeMap.put("Ismail", 111000);
        employeeMap.put("Zorana", 125000);
        employeeMap.put("Mehmet", 130000);
        employeeMap.put("Yuliia", 127005);
        employeeMap.put("Yasin,", 130000);
        employeeMap.put("Meltem", 121000);
        employeeMap.put("Dilem", 150000);
        employeeMap.put("Davut", 123000);
        employeeMap.put("Ekaterina", 135000);
        employeeMap.put("Mehmut", 143000);
        employeeMap.put("Merve,", 122000);
        employeeMap.put("Tamara", 133000);

        // iterate the keys ONLY:
        for (String eachKey : employeeMap.keySet()) {
            System.out.println("eachKey = " + eachKey);
        }

        System.out.println("/n******************************");

        //iterate the values ONLY:
        for (Integer eachValue : employeeMap.values()) {
            System.out.println("eachValue = " + eachValue);
        }

        System.out.println("/n******************************");

        //iterate the entries (key & value) ONLY:
        for (Map.Entry<String, Integer> eachEntry : employeeMap.entrySet()) {
            System.out.println(eachEntry.getKey()+" : "+eachEntry.getValue());

        }

        System.out.println("/n******************************");
        System.out.println(employeeMap);

        System.out.println("/n******************************");

        //find the max salary, print the name of the employee(s) who have the max salary

        int max = Integer.MIN_VALUE;
        String name= "";

        for (Map.Entry<String, Integer> entry : employeeMap.entrySet()) {
            String eachName = entry.getKey();
            Integer eachSalary = entry.getValue();
            if(eachSalary > max){
                max = eachSalary;
                name = eachName;
            }
        }
        System.out.println("max = " + max);
        System.out.println("name = " + name);


    }
}
