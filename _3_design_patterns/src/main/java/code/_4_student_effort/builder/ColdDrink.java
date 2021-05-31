package code._4_student_effort.builder;

public class ColdDrink implements  Item {

    @Override
    public String name() {
        return "Cold Drink";
    }

    @Override
    public Packing packing() {
        Bottle b=new Bottle();
        System.out.print("Packing with ");
        b.pack();
        return b;
    }

    @Override
    public float price() {
        return 3.5F;
    }
}
