package code._4_student_effort.ch6;

public class Main {
    public static void main(String[] args) {
        Person p=new Person(
                "Andrei",
                new Job("IT programmer"),
                new University("UPB"),
                new Licenses(new String[]{"A2","B2","B3"}),
                false
        );
        System.out.print(p);
    }
}
