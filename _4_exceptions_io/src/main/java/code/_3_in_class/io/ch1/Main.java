package code._3_in_class.io.ch1;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook=new PhoneBook("./src/main/java/code/_3_in_class/io/ch1/input.txt");
        System.out.println(phoneBook);
        System.out.println("Abbey "+phoneBook.getNumberByName("Abbey"));
        System.out.println("Abdul "+phoneBook.getNumberByName("Abdul"));

    }
}
