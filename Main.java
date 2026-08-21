import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lines = line.split(" ");

        HashSet<String> seen = new HashSet<String>();
        for(String s : lines){
            seen.add(s);
        }

        System.out.println(seen.size());
    }
}
