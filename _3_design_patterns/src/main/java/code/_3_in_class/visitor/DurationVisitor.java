package code._3_in_class.visitor;

public class DurationVisitor implements Visitor {
    private float totalDuration=0f;

    @Override
    public void visit(Video video) {
        totalDuration+=video.getMinutes();
    }

    @Override
    public void visit(Book book) {
        totalDuration+=book.getNumberOfPages()*4;
    }

    @Override
    public void visit(Audio audio) {
        totalDuration+=audio.getMinutes();
    }

    @Override
    public String toString() {
        return "Total time: "+totalDuration;
    }
}
