package code._3_in_class.ch2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ZigZag {
    public static void main(String[] args) {
        List<Integer> elements= Arrays.asList(1,4,2,3,5,76,56,33,77,2);
        Collections.sort(elements);
        System.out.println(elements);

        List newList=new ArrayList();
        int n=elements.size();
        for(int i=0;i<=n/2 && i<=n-i-1;i++){
            newList.add(elements.get(i));
            if(i!=n-i-1)
                newList.add(elements.get(n-i-1));
        }
        System.out.println(newList);
    }
}
