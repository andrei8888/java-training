package code._4_student_effort.builder;

public class Pepsi extends  ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
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
