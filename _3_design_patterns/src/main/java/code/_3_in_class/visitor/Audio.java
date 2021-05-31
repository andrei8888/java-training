package code._3_in_class.visitor;

public class Audio implements Element {
    private String name;
    private float minutes;
    private float price;

    public String getName() {
        return name;
    }

    public float getMinutes() {
        return minutes;
    }

    public float getPrice() {
        return price;
    }

    public Audio(String name, float minutes, float price) {
        this.name = name;
        this.minutes = minutes;
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
