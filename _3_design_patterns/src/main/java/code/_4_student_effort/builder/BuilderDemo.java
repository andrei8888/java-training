package code._4_student_effort.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        MealBuilder mac=new MealBuilder();

        Meal meal1=mac.prepareVegMeal();
        meal1.showItems();

        Meal meal2=mac.prepareChickenMeal();
        meal2.showItems();
    }
}
