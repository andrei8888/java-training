package code._3_in_class.ch2;

public class BankAccount {
    private String name;
    private int debit;

    public BankAccount(String name,int debit){
        this.name=name;
        this.debit=debit;
    }

    void withdraw(double amount){
        longDatabaseCall();
        this.debit-=amount;
    }

    void deposit(double amount){
        longDatabaseCall();
        this.debit+=amount;
    }

    void longDatabaseCall(){
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", debit=" + debit +
                '}';
    }
}
