package Lesson1;

public class bankAccount {
    
    int id;
    String name;
    double balance;


    public static void main(String[] args) {

        bankAccount MyAccount = new bankAccount();
        bankAccount YourAccount = new bankAccount();
        bankAccount HisAccount = new bankAccount();

        MyAccount.id = 10;
        MyAccount.name = "Pavlik";
        MyAccount.balance = 20;

        YourAccount.id = 3;
        YourAccount.name = "Maxim";
        YourAccount.balance = 2.35;

        HisAccount.id = 2;
        HisAccount.name = "Maxim";
        HisAccount.balance = 2.35;

        // System.out.println(MyAccount.id);
        // System.out.println(MyAccount.id);
        // System.out.println(MyAccount.id);

        // System.out.println(YourAccount.id);
        // System.out.println(YourAccount.id);
        // System.out.println(YourAccount.id);

        // System.out.println(HisAccount.id);
        // System.out.println(HisAccount.id);
        // System.out.println(HisAccount.id);

        // System.out.println(MyAccount.decrease(MyAccount.balance, MyAccount.id));

        double PopolnenieScheta = MyAccount.increase(MyAccount.balance, 0);
        System.out.println(PopolnenieScheta);
       double newBalance = PopolnenieScheta;

        double SnjatiesScheta = MyAccount.decrease(newBalance, 5);
        System.out.println(SnjatiesScheta);

    }

    double decrease(double a1, double b1) {
        double result = a1 - b1;
        return result;
    }

    double increase(double a2, double b2) {
        double result = a2 + b2;
        return result;
    }



}
