import java.util.Scanner;

public class Main {

    static int safeDivide(int a, int b) {
        try{
            return a / b;
        } catch(ArithmeticException e){
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(safeDivide(a, b));
    }
}


