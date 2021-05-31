package code._3_in_class.visitor;

public interface Visitor {
    void visit(Video video);
    void visit(Book book);
    void visit(Audio audio);
}
