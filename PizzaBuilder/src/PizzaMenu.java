import java.util.ArrayList;

public class PizzaMenu {
    private final Dough dough;
    private ArrayList<Toppings> toppings;
    private Drink drink;
    private Sauce sauce;

    public PizzaMenu(PizzaMenuBuilder pizzaBuilder){
        this.dough=pizzaBuilder.getDough();
        this.toppings=pizzaBuilder.getToppings();
        this.drink=pizzaBuilder.getDrink();
        this.sauce=pizzaBuilder.getSauce();
    }

    @Override
    public String toString() {
        StringBuilder pizzaString=new StringBuilder("Created pizza menu:\n\tPizza with " + dough +" dough size ");
        if(toppings.size()!=0) {
            pizzaString.append(" and the toppings: {");
            for (int i = 0; i < toppings.size() - 1; i++)
                pizzaString.append(toppings.get(i).toString() + ", ");
            pizzaString.append("and " + toppings.get(toppings.size() - 1) + "}");
        }
        if(drink!=null)
            pizzaString.append("\n\t"+drink.toString()+" drink");
        if(sauce!=null)
            pizzaString.append("\n\t"+sauce.toString()+" sauce");
        pizzaString.append("\n");
        return pizzaString.toString();
    }
}
