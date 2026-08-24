import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kind = sc.nextLine();
        double dim = Double.parseDouble(sc.nextLine());
        Shape s = kind.equals("circle") ? new Circle(dim) : new Square(dim);
        System.out.println(String.format("%.2f", s.area()));
    }
}

interface Shape {
    double area();
}

class Circle implements Shape {
    private  double radius;

    Circle(double rad) {
        this.radius = rad;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Square implements Shape {
    private  double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
