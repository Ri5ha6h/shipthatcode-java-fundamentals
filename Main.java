import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lines = line.split(" ");

        int max = Integer.parseInt(lines[0]);
        for(int i = 1; i < lines.length; i++){
            int compInt =  Integer.parseInt(lines[i]);
            if(compInt > max){
                max = compInt;
            }
        }

        System.out.println(max);
    }
}
