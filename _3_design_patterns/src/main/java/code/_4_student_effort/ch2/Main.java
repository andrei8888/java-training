package code._4_student_effort.ch2;

import java.util.Arrays;

public class Main {
    public static void displaySorted(SortingStrategy strategy, Integer[] array){
        strategy.sort(array);
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] arr=new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] copy1=Arrays.copyOf(arr,arr.length);
        Integer[] copy2=Arrays.copyOf(arr,arr.length);

        displaySorted(new BubleSort(),copy1);
        displaySorted(new MergeSort(),copy2);
    }
}
