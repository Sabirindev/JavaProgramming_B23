package day38_ClassObject_thisKeyWord_toString.bankAccountTask;

import day38_ClassObject_thisKeyWord_toString.bankAccountTask.BankAccount;

public class CitiBank {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Sabir",123456789L,0);

        account1.checkBalance();
        account1.deposit(1000);
        account1.checkBalance();
        account1.withdraw(999);
        account1.checkBalance();

        account1.withdraw(25);
        account1.checkBalance();

        account1.withdraw(10);
        account1.checkBalance();

        account1.deposit(100000);
        account1.checkBalance();

        System.out.println("*********************************************************************");
        BankAccount account2 = new BankAccount();
        account2.setInfo("Ahmad",987456321,0);
        account2.deposit(100000);

        account1.checkBalance();


    }
}
