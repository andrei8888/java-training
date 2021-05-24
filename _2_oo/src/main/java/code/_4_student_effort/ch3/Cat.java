package code._4_student_effort.ch3;

import code._4_student_effort.ch3.Animal;
import code._4_student_effort.ch3.Pet;

public class Cat extends Animal implements Pet {
    String name;

    public Cat(String name){
        super(4);
        this.name=name;
    }

    public Cat(){
        this("");
    }

    /*@Override
    public void walk(){
        System.out.println("Walks in ")
    }*/

    @Override
    public void eat() {
        System.out.println("Eats rodents");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void play() {
        System.out.println("Plays with hooman");
    }
}