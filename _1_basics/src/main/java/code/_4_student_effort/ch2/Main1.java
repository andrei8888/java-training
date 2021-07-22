package lab1.ch2;

public class Main1 {
    public static String compute(int n){
        String str=new String();
        if(n%3==0)
            str+="Foo";
        if(n%5==0)
            str+="Bar";
        if(n%7==0)
            str+="Qix";
        int cf;
        while(n!=0){
            cf=n%10;
            if(cf==3)
                str+="Foo";
            if(cf==5)
                str+="Bar";
            if(cf==7)
                str+="Qix";
            n/=10;
        }
        return str;
    }
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            System.out.println(i+" : "+compute(i));
        }

    }
}
