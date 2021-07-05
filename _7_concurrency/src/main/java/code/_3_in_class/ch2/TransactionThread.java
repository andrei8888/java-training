package code._3_in_class.ch2;

public class TransactionThread extends Thread {
    private String name;
    private BankAccount from;
    private BankAccount to;
    private int amount;

    public TransactionThread(String name,BankAccount from, BankAccount to,int amount){
        this.name=name;
        this.from=from;
        this.to=to;
        this.amount=amount;
    }

    @Override
    public void run(){
        transfer(this.from,this.to,this.amount);
    }

    public void transfer(BankAccount from,BankAccount to, int amount){
        synchronized (from) {
            from.withdraw(amount);
            synchronized (to) {
                to.deposit(amount);
            }
        }
    }
}
