package code._3_in_class.decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Decorator");
        Beverage coffe=new Coffee();
        coffe=new Milk(coffe);
        coffe=new Chocolate(coffe);

        System.out.println(coffe.getCost());
        System.out.println(coffe.getDescription());
    }
}
