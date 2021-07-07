package code._4_student_effort.ch9;

public class GenericSet<T> implements MySet<T> {
    private T[] set;
    private int size;
    private int capacity;

    public GenericSet(){
        set = (T[]) new Object[10];
        size=0;
        capacity=10;
    }

    @Override
    public void add(T e) {
        for(int i=0;i<size;i++)
            if(set[i].equals(e))
                return;
        if(size>=capacity){
            T[] dummy= set;
            capacity+=10;
            set =(T[]) new Object[capacity];
            System.arraycopy(dummy,0, set,0, set.length);
        }
        set[size]=e;
        size++;
    }

    @Override
    public void remove(T e) {
        for(int i=0;i<size;i++)
            if(set[i].equals(e)){
                for(int j=i;j<size-1;j++)
                    set[j]=set[j+1];
                size--;
            }
    }

    @Override
    public T get(int index) {
        return set[index];
    }

    @Override
    public void set(int index, T e) {
        if(index==size){
            add(e);
        }
        else if(index<size){
            set[index]=e;
        }
        else{
            for(int i=size;i<index;i++)
                add(null);
            set[index]=e;
            size++;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String toReturn = "{";
        for(int i=0;i<size-1;i++)
            toReturn+=set[i]+", ";
        toReturn+=set[size-1]+"}";
        return toReturn;
    }

    @Override
    public boolean contains(T e) {
        for(int i=0;i<size;i++)
            if(set[i].equals(e))
                return true;
        return false;
    }
}
