package code._4_student_effort.ch3;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs){
        this.legs=legs;
    }

    public void walk(){
        System.out.println("Walking in "+legs+"legs");
    }

    public abstract void eat();
}