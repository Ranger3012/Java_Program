
import java.util.Scanner;

public class OddAndEven{
    public static void main(String[] args) {
        int x;
        Scanner in = new Scanner(System.in);

        x = in.nextInt();

        if(x % 2 == 0){
            System.out.println("x: " + x + " is Even.");
        }else{
            System.out.println("x: " + x + " is Odd.");
        }
    }
}