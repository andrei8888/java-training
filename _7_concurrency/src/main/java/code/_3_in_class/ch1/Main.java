package code._3_in_class.ch1;

public class Main {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if(i%2==0){
                (new RabbitThread(i)).start();
            }
            else{
                (new Thread(new RabbitRunnable(i))).start();
            }
        }
    }
}
