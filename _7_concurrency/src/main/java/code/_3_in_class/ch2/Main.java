package code._3_in_class.ch2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount1=new BankAccount("BA1",23_000);
        BankAccount bankAccount2=new BankAccount("BA2",30_000);

        TransactionThread ta1=new TransactionThread("Trans1",bankAccount1,bankAccount2,4_000);
        TransactionThread ta2=new TransactionThread("Trans2",bankAccount1,bankAccount2,4_000);

        ta1.start();
        ta2.start();

        ta1.join();
        ta2.join();

        System.out.println("after: ");
        System.out.println(bankAccount1);
        System.out.println(bankAccount2);
    }
}
