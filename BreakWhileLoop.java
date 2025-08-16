
import java.util.Scanner;

class BreakWhileLoop{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        while (true) { 
            System.out.println("Enter an Integer: ");
            n = sc.nextInt();

            if(n == 0){
                break;
            }
            System.out.println("You Entered: " +n);
            
        }
    }
}