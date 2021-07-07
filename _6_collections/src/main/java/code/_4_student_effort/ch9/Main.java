package code._4_student_effort.ch9;

public class Main {
    public static void main(String[] args) {
        GenericSet<Integer> genericSet=new GenericSet<>();
        genericSet.add(2);
        genericSet.add(4);
        genericSet.add(123);
        genericSet.add(4);
        System.out.println(genericSet);
    }
}
