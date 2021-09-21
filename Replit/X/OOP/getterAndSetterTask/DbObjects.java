package X.OOP.getterAndSetterTask;

import java.util.Scanner;

public class DbObjects {
    public static void main(String[] args) {
//        Db obj1 = new Db("Gabil",100);
//
//        System.out.println(obj1);

        Scanner in = new Scanner(System.in);
        Db db = new Db(in.next(),in.nextInt());

        System.out.println(db.getData());
        System.out.println(db.getYint());

        db.setData(in.next());
        db.setYint(in.nextInt());

        System.out.println(db.getData());
        System.out.println(db.getYint());

    }
}
