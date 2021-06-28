package code._4_student_effort.ch5;

import code._2_challenge._5_generic_binary_search.ArrayNotSortedException;

import java.util.Comparator;

public class GenericBinarySearch {
    <T extends Comparable<T>>int binarySearch(T[] array,T value) throws ArrayNotSortedException {
        Boolean ascOrder=null;
        for(int i=1;i<array.length;i++){
            if(ascOrder==null){
                if(array[i-1].compareTo(array[i])<0)
                    ascOrder=Boolean.TRUE;
                else
                    ascOrder=Boolean.FALSE;
            }
            else{
                if(ascOrder==Boolean.TRUE && array[i-1].compareTo(array[i])>0 || ascOrder==Boolean.FALSE && array[i-1].compareTo(array[i])<0)
                    throw new ArrayNotSortedException();
            }
        }
        int low=0;
        int high=array.length;
        boolean k=true;
        int mid=0;
        while(low<high){
            if((low+high)/2!=mid)
                mid=(low+high)/2;
            else
                break;
            if(array[mid].compareTo(value)>0)
                high=mid;
            else if(array[mid].compareTo(value)<0)
                low=mid;
            else
                return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        Integer[] ar=new Integer[]{1,4,66,66,100};
        GenericBinarySearch gbs=new GenericBinarySearch();
        try {
            System.out.print(gbs.binarySearch(ar,100));
        } catch (ArrayNotSortedException e) {
            e.printStackTrace();
        }
    }
}