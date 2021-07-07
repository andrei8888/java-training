package code._4_student_effort.ch8;

import java.util.Arrays;

public class GenericArrayList<T> implements MyArrayList<T>{
    private T[] array;
    private int size;
    private int capacity;

    public GenericArrayList(){
        array = (T[]) new Object[10];
        size=0;
        capacity=10;
    }

    @Override
    public void add(T e) {
        if(size>=capacity){
            T[] dummy=array;
            capacity+=10;
            array=(T[]) new Object[capacity];
            System.arraycopy(dummy,0,array,0,array.length);
        }
        array[size]=e;
        size++;
    }

    @Override
    public void remove(T e) {
        for(int i=0;i<size;i++)
            if(array[i].equals(e)){
                for(int j=i;j<size-1;j++)
                    array[j]=array[j+1];
                size--;
            }
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public void set(int index, T e) {
        if(index==size){
            add(e);
        }
        else if(index<size){
            array[index]=e;
        }
        else{
            for(int i=size;i<index;i++)
                add(null);
            array[index]=e;
            size++;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String toReturn = "[";
        for(int i=0;i<size-1;i++)
            toReturn+=array[i]+", ";
        toReturn+=array[size-1]+"]";
        return toReturn;
    }
}
