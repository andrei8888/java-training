package code._3_in_class.visitor;

public class Book implements Element {
    private String name;
    private int numberOfPages;
    private float price;

    public Book(String name, int numberOfPages, float price) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
