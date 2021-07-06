package code._4_student_effort.ch7;

public class Main {
    public static void main(String[] args) {
        MyHashTable<String,String> myHashTable=new StringHash();
        myHashTable.put("key1","value1");
        myHashTable.put("key2","value2");
        myHashTable.put("key3","value3");
        myHashTable.remove("key2");
        System.out.println(myHashTable);
    }
}
