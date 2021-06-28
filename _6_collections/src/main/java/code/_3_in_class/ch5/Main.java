package code._3_in_class.ch5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static List<Integer> merge(List<Integer> list1,List<Integer> list2){
        List<Integer> toReturn = new ArrayList<>();
        Iterator<Integer> i1 = list1.iterator();
        Iterator<Integer> i2 = list2.iterator();
        Integer current1=i1.next();
        Integer current2=i2.next();
        while(i1.hasNext() && i2.hasNext()){
            if(current1.compareTo(current2)<0) {
                toReturn.add(current1);
                current1 = i1.next();
            }
            else {
                toReturn.add(current2);
                current2 = i2.next();
            }
        }
        if(current1.compareTo(current2)<0) {
            toReturn.add(current1);
            current1 = i1.next();
        }
        else {
            toReturn.add(current2);
            current2 = i2.next();
        }
        /*while(i1.hasNext()) {
            toReturn.add(current1);
            current1 = i1.next();
        }

        while(i2.hasNext()) {
            toReturn.add(current2);
            current2 = i2.next();
        }*/
        return toReturn;
    }

    public static void main(String[] args) {
        List<Integer> i1 = Arrays.asList(1,3,4,6,88,99);
        List<Integer> i2 = Arrays.asList(2,3,4,66,87,999);
        System.out.print(merge(i1,i2));
    }
}
