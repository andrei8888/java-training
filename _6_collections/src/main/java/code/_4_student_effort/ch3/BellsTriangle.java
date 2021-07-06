package code._4_student_effort.ch3;

import java.util.Arrays;

public class BellsTriangle {
    static final int n=15;

    private static void display(int[] arr,int n){
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+ " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array=new int[1];
        int[] prev;
        array[0]=1;
        display(array,1);
        for(int i=1;i<n;i++){
            prev=array;
            array=new int[i+1];
            array[0]=prev[i-1];
            for(int j=1;j<=i;j++)
                array[j]=array[j-1]+prev[j-1];
            display(array,i+1);
        }
    }
}
