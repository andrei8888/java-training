public class PizzaCreator {
    public static void main(String[] args) {
        PizzaMenuBuilder pizzasWithThickDough=new PizzaMenuBuilder(Dough.Thick);
        pizzasWithThickDough.addTopping(Toppings.Mushrooms).addTopping(Toppings.Cheese).addTopping(Toppings.Ham);
        pizzasWithThickDough.addDrink(Drink.Beer);
        pizzasWithThickDough.addSauce(Sauce.Mayonnaise);
        PizzaMenu pizza1=pizzasWithThickDough.create();
        System.out.println(pizza1);

        PizzaMenuBuilder pizzasWithThinDough=new PizzaMenuBuilder(Dough.Thin);
        pizzasWithThinDough.addTopping(Toppings.Salami).addTopping(Toppings.Mozzarella).addTopping(Toppings.Olives);
        pizzasWithThinDough.addDrink(Drink.Pepsi);
        pizzasWithThinDough.addSauce(Sauce.Spicy_Ketchup);
        PizzaMenu pizza2=pizzasWithThinDough.create();
        System.out.println(pizza2);
    }
}
