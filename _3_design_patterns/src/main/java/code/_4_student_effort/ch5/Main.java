package code._4_student_effort.ch5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr=new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] copy1= Arrays.copyOf(arr,arr.length);
        Integer[] copy2=Arrays.copyOf(arr,arr.length);

        AscBubleSort asc=new AscBubleSort();
        asc.sort(copy1);
        displaySorted(copy1);

        DescBubleSort dsc=new DescBubleSort();
        dsc.sort(copy2);
        displaySorted(copy2);
    }

    private static void displaySorted(Integer[] array) {
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
        System.out.println();
    }
}
