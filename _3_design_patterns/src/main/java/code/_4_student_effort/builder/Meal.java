package code._4_student_effort.builder;

import java.util.ArrayList;

public class Meal {
    ArrayList<Item> items=new ArrayList<Item>();
    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float totalCost=0;
        for(Item item: items){
            totalCost+=item.price();
        }
        return totalCost;
    }

    public void showItems() {
        for(Item item: items){
            System.out.print(item.name()+" ");
            item.packing();
            System.out.println(" Price: "+item.price());
        }
    }
}
