package code._4_student_effort.ch7;

import java.util.Arrays;

public class GenericHash<K,V> implements MyHashTable<K,V> {
    private GenericPair<K,V>[] pairs;
    private int size;

    public GenericHash(){
        pairs=new GenericPair[10];
        size=0;
    }

    @Override
    public V get(K key) {
        for(int i=0;i<size;i++)
            if(pairs[i].getKey().equals(key))
                return pairs[i].getValue();
        return null;
    }

    public int getIndex(K key) {
        for(int i=0;i<size;i++)
            if(pairs[i].getKey().equals(key))
                return i;
        return -1;
    }

    @Override
    public void put(K key, V value) {
        int putInd=getIndex(key);
        if(putInd==-1){
            pairs[size]=new GenericPair<>(key, value);
            size++;
        }
        else{
            pairs[putInd].setValue(value);
        }
    }

    @Override
    public void remove(K key) {
        int putInd=getIndex(key);
        for(int i=putInd;i<size-1;i++)
            pairs[i]=pairs[i+1];
        size--;

    }

    @Override
    public boolean containsKey(K key) {
        return (getIndex(key)!=-1);
    }

    @Override
    public String toString() {
        String toReturn="";
        for(int i=0;i<size;i++)
            toReturn+=pairs[i]+" ";
        return toReturn;
    }

    @Override
    public int size() {
        return size;
    }
}
