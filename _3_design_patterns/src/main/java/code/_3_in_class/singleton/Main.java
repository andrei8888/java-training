package code._3_in_class.singleton;

public class Main{
    public static void main(String[] args){
        LazyInit li = LazyInit.getInstance();
        System.out.println(li);
    }
}