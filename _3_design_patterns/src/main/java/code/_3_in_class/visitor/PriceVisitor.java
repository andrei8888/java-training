package code._3_in_class.visitor;

public class PriceVisitor implements Visitor {
    private float totalPrice=0F;

    @Override
    public void visit(Video video) {
        totalPrice+=video.getPrice();
    }

    @Override
    public void visit(Book book) {
        totalPrice+= book.getPrice();
    }

    @Override
    public void visit(Audio audio) {
        totalPrice+=audio.getPrice();
    }

    @Override
    public String toString() {
        return "PriceVisitor{" +
                "totalPrice=" + totalPrice +
                '}';
    }
}
