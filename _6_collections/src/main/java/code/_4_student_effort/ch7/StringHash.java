package code._4_student_effort.ch7;

public class StringHash implements MyHashTable<String,String> {
    PairStrings[] pairs;
    int size;

    public StringHash(){
        pairs=new PairStrings[10];
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
        pairs[size]=new PairStrings(key,value);
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
