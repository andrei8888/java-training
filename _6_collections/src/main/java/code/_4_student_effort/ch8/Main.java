package code._4_student_effort.ch8;

public class Main {
    public static void main(String[] args) {
        GenericArrayList<Integer> arrayList=new GenericArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(10);
        System.out.println(arrayList);
        arrayList.set(7,12);
        System.out.println(arrayList);
    }
}
