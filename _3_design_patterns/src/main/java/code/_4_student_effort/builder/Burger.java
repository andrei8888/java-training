package code._4_student_effort.builder;

public class Burger implements Item {

    @Override
    public String name() {
        return "Burger";
    }

    @Override
    public Packing packing() {
        Wrapper wp=new Wrapper();
        System.out.print("Packing with ");
        wp.pack();
        return wp;
    }

    @Override
    public float price() {
        return 5;
    }
}
