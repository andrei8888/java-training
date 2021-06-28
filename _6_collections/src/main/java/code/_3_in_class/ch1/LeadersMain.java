package code._3_in_class.ch1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LeadersMain {
    public static void displayLeaders(List<Integer> elements){
        System.out.println(elements);
        Collections.reverse(elements);
        int max=elements.get(0);
        for(int currentElement : elements)
            if(currentElement>max){
                System.out.print(currentElement + " ");
                max=currentElement;
            }
    }

    public static void main(String[] args) {
        List elem=new ArrayList();
        elem.add(7);
        elem.add(5);
        elem.add(3);
        elem.add(2);
        elem.add(1);
        elem.add(1);
        displayLeaders(elem);
    }
}
