package code._3_in_class.ch1;

public class RabbitRunnable implements Runnable {
    private int nr;
    public RabbitRunnable(int nr){
        this.nr=nr;
    }

    @Override
    public void run(){
        System.out.println("Rabbit "+nr+" is running");
    }
}
