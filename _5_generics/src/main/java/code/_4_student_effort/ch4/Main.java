package code._4_student_effort.ch4;

public class Main {
    public static void main(String[] args){
        Integer[] arr=new Integer[]{1,2,3};
        IArrayIterator<Integer> it=new ArrayIterator<>(arr);
        while(it.hasNext())
            System.out.println(it.next());
    }
}
