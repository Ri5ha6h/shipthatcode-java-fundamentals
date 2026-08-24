import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Animal d = new Dog(name);

        System.out.println(d.greet());
    }
}

class Animal {
    protected String name;

    Animal(String name) {
        this.name = name;
    }

    String greet() {
        return this.name + " says hello";
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    String greet() {
        return this.name + " says woof";
    }
}
