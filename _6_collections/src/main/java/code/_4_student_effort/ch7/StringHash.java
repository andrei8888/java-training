package code._4_student_effort.ch7;

import java.util.Arrays;

public class StringHash implements MyHashTable<String,String> {
    Pair[] pairs;
    int size;

    public StringHash(){
        pairs=new Pair[10];
        size=0;
    }

    @Override
    public String get(String key) {
        String value=null;
        for(int i=0;i<size;i++)
            if(pairs[i].getKey().equals(key)){
                value=pairs[i].getValue();
                break;
            }
        return value;
    }

    @Override
    public void put(String key, String value) {
        pairs[size]=new Pair(key,value);
        size++;
    }

    @Override
    public void remove(String key) {
        for(int i=0;i<size;i++)
            if(pairs[i].getKey().equals(key)){
                for(int j=i;j<size-1;j++)
                    pairs[j]=pairs[j+1];
            }
        size--;
    }

    @Override
    public boolean containsKey(String key) {
        boolean contains=false;
        for(int i=0;i<size;i++)
            if(pairs[i].getKey().equals(key)){
                contains=true;
                break;
            }
        return contains;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        String toReturn = new String();
        for(int i=0;i<size;i++)
            toReturn+=pairs[i]+" ";
        return toReturn;
    }
}
