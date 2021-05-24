package code._4_student_effort.ch3;

import code._4_student_effort.ch3.Animal;

public class Fish extends Animal {

    public Fish(){
        super(0);
    }

    @Override
    public void walk(){
        System.out.println("Can't walk");
    }

    @Override
    public void eat() {
        System.out.println("Eats fish chips");
    }
}