
import java.util.Scanner;

public class AddNumber{
    public static void main(String[] args) {
        int x, y, sum;
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();

        sum = x + y;

        System.out.println("Sum is:" +sum);

    }
}