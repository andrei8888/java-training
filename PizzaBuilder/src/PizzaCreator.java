public class PizzaCreator {
    public static void main(String[] args) {
        PizzaMenu pizza1=new PizzaMenuBuilder(Dough.Thick)
                .addTopping(Toppings.Mushrooms)
                .addTopping(Toppings.Cheese)
                .addTopping(Toppings.Ham)
                .addDrink(Drink.Beer)
                .addSauce(Sauce.Mayonnaise)
                .create();
        System.out.println(pizza1);

        PizzaMenu pizza2=new PizzaMenuBuilder(Dough.Thin)
                .addTopping(Toppings.Salami)
                .addTopping(Toppings.Mozzarella)
                .addTopping(Toppings.Olives)
                .addDrink(Drink.Pepsi)
                .addSauce(Sauce.Spicy_Ketchup)
                .create();
        System.out.println(pizza2);
    }
}
