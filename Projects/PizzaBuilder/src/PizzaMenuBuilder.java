import java.util.ArrayList;

public class PizzaMenuBuilder {

    private final Dough dough;
    private final ArrayList<Toppings> toppings;
    private Drink drink;
    private Sauce sauce;

    public PizzaMenu create(){
        return new PizzaMenu(this);
    }

    public PizzaMenuBuilder(Dough dough){
        toppings=new ArrayList<>(7);
        this.dough=dough;
    }

    public PizzaMenuBuilder addTopping(Toppings topping){
        toppings.add(topping);
        return this;
    }

    public PizzaMenuBuilder addDrink(Drink drink){
        this.drink=drink;
        return this;
    }

    public PizzaMenuBuilder addSauce(Sauce sauce){
        this.sauce=sauce;
        return this;
    }

    public Dough getDough() {
        return dough;
    }

    public ArrayList<Toppings> getToppings() {
        return toppings;
    }

    public Drink getDrink() {
        return drink;
    }

    public Sauce getSauce() {
        return sauce;
    }
}
