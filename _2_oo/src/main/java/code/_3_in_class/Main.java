package code._3_in_class;

import java.util.Date;

public class Main {
    static void primitive1(int i){
        i=1;
    }
    static void primitive2(Integer i){
        i=2;
    }
    static void setYear(Date d){
        d.setYear(2000);
    }

    public static void main(String[] args) {
        int p1=100;
        Integer p2=new Integer(200);
        primitive1(p1);
        primitive2(p2);
        System.out.println(p1+" "+p2);
        Date d=new Date(2,2,2018);
        System.out.println(d.getYear());
        setYear(d);
        System.out.println(d.getYear());
    }
}