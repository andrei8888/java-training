package code._4_student_effort.builder;

public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken burger";
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
        return (float)4.5+super.price();
    }
}
