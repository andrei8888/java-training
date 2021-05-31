package code._4_student_effort.ch1;

public class ArrayCustomIterator {
    int current=0;
    int[] array;

    public ArrayCustomIterator(int[] array){
        this.array=array;
    }

    boolean hasNext(){
        return current < array.length;
    }

    int next(){
        int currentValue=array[current];
        current++;
        return currentValue;
    }
}
