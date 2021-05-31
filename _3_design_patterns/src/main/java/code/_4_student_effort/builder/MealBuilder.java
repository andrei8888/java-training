package code._4_student_effort.builder;

public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal vegMeal=new Meal();
        vegMeal.addItem(new VegBurger());
        vegMeal.addItem(new Coke());
        return vegMeal;
    }

    public Meal prepareChickenMeal(){
        Meal chickMeal=new Meal();
        chickMeal.addItem(new ChickenBurger());
        chickMeal.addItem(new Pepsi());
        return chickMeal;
    }
}
