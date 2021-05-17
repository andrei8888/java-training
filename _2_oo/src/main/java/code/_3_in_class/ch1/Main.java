package code._3_in_class.ch1;


public class Main {
    public static void main(String[] args){
        Fighter f1=new Fighter("Zamolxe",100,20);
        Fighter f2=new Fighter("Zeus",130,20);
        BoxingMatch meciulZeilor=new BoxingMatch(f1,f2);
        System.out.print(meciulZeilor.fight());
    }
}
