
import java.util.Scanner;

class GetUserInput{
    public static void main(String args[]) {
        int a;
        float b;
        String s;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        s = input.nextLine();
        System.out.println("You enterd string - " +s);

        System.out.println("Enter an integer:");
        a = input.nextInt();
        System.out.println("You enterd integer - " +a);

        System.out.println("Enter a float:");
        b = input.nextFloat();
        System.out.println("You enterd float - " +b);
    }
}