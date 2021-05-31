package code._4_student_effort.ch3;

public class Main {
    public static void main(String[] args) {
        Apartment app1=new Apartment("Crangasi01",300);
        Apartment app2=new Apartment("Crangasi01",600);
        Apartment app3=new Apartment("Crangasi01",350);
        Apartment app4=new Apartment("Crangasi01",400);
        Apartment app5=new Apartment("Crangasi01",200);

        RealEstateAgentProxy proxy=new RealEstateAgentProxy();
        proxy.represent(app1);
        proxy.represent(app2);
        proxy.represent(app3);
        proxy.represent(app4);
        proxy.represent(app5);

        Student st1=new Student("Ion",500);
        Student st2=new Student("Pop",200);

        Apartment appForSt1=proxy.rent(st1);
        System.out.println(st1.getName()+" rented "+appForSt1);
        Apartment appForSt2=proxy.rent(st2);
        System.out.println(st2.getName()+" rented "+appForSt2);

    }
}
