package day39_CustomClass_Statics;

class  CybertekStudent{
    public String name, gender; //instance variable
    public int age, ID;//instance variable
    public static String schoolName = "Cybertek School"; //static variable
    public static String programmingLanguage = "Java";//static variable


    public  void printName(){ //instance method
        System.out.println(name);
    }

    public static void printSchoolName(){ //static method
        System.out.println(schoolName);
    }

    public void method2(){ //instance method
        System.out.println(schoolName);
    }

    public void getInfo(){ //instance method
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(ID);
        System.out.println(schoolName);
        System.out.println(programmingLanguage);
    }


}






public class StaticExamples {

    public static void main(String[] args) {

        CybertekStudent student1 = new CybertekStudent();
        CybertekStudent student2 = new CybertekStudent();
        CybertekStudent student3 = new CybertekStudent();
        CybertekStudent student4 = new CybertekStudent();

        System.out.println(student1.schoolName); // static variable is called through class object
        System.out.println(student2.schoolName);// static variable is called through class object
        System.out.println(student3.schoolName);// static variable is called through class object
        System.out.println(student4.schoolName);// static variable is called through class object
        System.out.println("------------------------------------------");
        System.out.println(student1.programmingLanguage);// static variable is called through class OBJECT
        System.out.println(student2.programmingLanguage);// static variable is called through class OBJECT
        System.out.println(student3.programmingLanguage);// static variable is called through class OBJECT
        System.out.println(student4.programmingLanguage);// static variable is called through class OBJECT

        System.out.println("--------------------------------------");

        System.out.println(CybertekStudent.schoolName);// static variable is called through class NAME
        System.out.println(CybertekStudent.programmingLanguage);// static variable is called through class NAME

        System.out.println(student1.age);// instance variable is called through class OBJECT
        //System.out.println(CybertekStudent.age);
        System.out.println("****************************************************************");

        CybertekStudent.printSchoolName(); // static method called through class NAME
        student1.printSchoolName();  // static method called through class OBJECT
    }
}
