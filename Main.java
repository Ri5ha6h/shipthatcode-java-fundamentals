import java.util.Scanner;

public class Main {

    record Point(int x1, int y1, int x2, int y2) {
        int distance() {
            return (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        Point newPoint = new Point(x1, y1, x2, y2);
        System.out.println(newPoint.distance());
    }
}
