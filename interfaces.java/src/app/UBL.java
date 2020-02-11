package app;
public class UBL implements Bank
{

    @Override
    public void credit() {
       int n = 1000;
       n = n + 15;
       System.out.println("credit value is: " + n);

    }

    @Override
    public void debit() {
        int debit;
        debit = 12000;
        System.out.println("debit values: " + debit);

    }

    @Override
    public void checkBalance() {
      String s = "Your balance is: ";
      int balance = 30000;
      System.out.println(s +"..."+ balance);

    }

}