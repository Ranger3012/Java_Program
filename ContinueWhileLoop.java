
import java.util.Scanner;

class ContinueWhileLoop{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input an Integer: ");
        n = sc.nextInt();

        while (n > 0) { 
            System.out.println("You have entered: "+n);
            continue;
            }
        }
    }