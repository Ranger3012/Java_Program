
import java.util.Scanner;

public class SwapNumberWithoutTemp {
    public static void main(String[] args) {
        int x, y;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter x and y:");
        x = in.nextInt();
        y = in.nextInt();


        System.out.println("Before Swap x:" +x+ "and y :" +y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swap x:" +x+ "and y :" +y);


    }
}