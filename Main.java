import java.util.Scanner;

public class Main {

    record Point(int x, int y) {
        int distance(Point other) {
            int dx = x - other.x;
            int dy = y - other.y;
            return (dx * dx + dy * dy);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        Point newPoint = new Point(x1, y1);
        System.out.println(newPoint.distance(new Point(x2, y2)));
    }
}
