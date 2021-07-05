package code._3_in_class.ch1;

public class RabbitThread extends Thread {
    private int nr;
    public RabbitThread(int nr){
        this.nr=nr;
    }

    @Override
    public void run(){
        System.out.println("Rabbit "+nr+" is running");
    }
}
