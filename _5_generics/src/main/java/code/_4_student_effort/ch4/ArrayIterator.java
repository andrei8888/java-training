package code._4_student_effort.ch4;

public class ArrayIterator<T> implements IArrayIterator<T> {
    private T[] array;
    private int current;

    public ArrayIterator(T[] array){
        this.array=array;
        current=0;
    }

    @Override
    public boolean hasNext() {
        return current!=array.length;
    }

    @Override
    public T next() {
        current++;
        return array[current-1];
    }
    
}
