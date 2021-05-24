package code._4_student_effort.ch3;

import code._4_student_effort.ch3.Animal;

public class Spider extends Animal {

    protected Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("eats bugs");
    }
}