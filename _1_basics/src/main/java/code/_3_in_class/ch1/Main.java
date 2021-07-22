package lab1.ch1;

public class Main {
    public void printNumber(int n){
        if(n%3==0)
            System.out.print("Fizz");
        if(n%5==0)
            System.out.print("Buzz");
        if(n%7==0)
            System.out.print("Rizz");
        if(n%11==0)
            System.out.print("Jazz");
        if(n%3!=0 && n%5!=0 && n%7!=0 && n%11!=0)
            System.out.print(n);
        System.out.println();
    }
    public static void main(String[] args){
        Main a=new Main();
        for(int i=1;i<=100;i++)
            a.printNumber(i);
    }
}
