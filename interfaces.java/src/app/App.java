package app;

public class App {
    public static void main(String[] args)
     {
        Bank obj1 = new UBL();
        obj1.checkBalance();
        obj1.credit();
        obj1.debit();
        System.out.println(obj1);
    }

}