
import java.util.Scanner;

class WhileLoop{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        while((n = sc.nextInt()) != 0){
            System.out.println("You have entered: " +n);
            System.out.println("Input an integer.");
               }
            System.out.println("Out of loop.");
    }
}