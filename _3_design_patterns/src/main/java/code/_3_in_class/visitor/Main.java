package code._3_in_class.visitor;

public class Main {
    public static void main(String[] args) {
        Element[] elements = new Element[]{
                new Book("Book title",200, 30.5F),
                new Audio("Audio title",3,15F),
                new Video("Video title",90F,70)
        };

        PriceVisitor priceVisitor=new PriceVisitor();
        for(Element currentElement:elements){
            currentElement.accept(priceVisitor);
        }
        System.out.println(priceVisitor);

        DurationVisitor durationVisitor=new DurationVisitor();
        for(Element currentElement:elements){
            currentElement.accept(durationVisitor);
        }
        System.out.print(durationVisitor);
    }
}
