package code._3_in_class.ch2;

public class Main {
    public static void main(String[] args) {
        Running running1=new Running();
        Running running2=new Running();
        Pair<Running> pair1=new Pair<>(running1,running2);
        
        Boot boot=new Boot();
        Pair pair2=new Pair(running1,boot);
    }
}
