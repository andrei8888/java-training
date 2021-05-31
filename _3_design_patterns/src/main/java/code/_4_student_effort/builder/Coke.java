package code._4_student_effort.builder;

public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
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
        return super.price();
    }
}
