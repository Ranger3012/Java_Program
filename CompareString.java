
import java.util.Scanner;

public class CompareString{
    public static void main(String[] args) {
        String s1, s2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String 1: ");
        s1 = sc.nextLine();

        System.out.println("Enter String 2: ");
        s2 = sc.nextLine();

        if(s1.compareTo(s2) > 0){
            System.out.println("String 1 is greater than String 2.");
        }else if(s2.compareTo(s1)> 0){
            System.out.println("String 2 is greater than String 1.");
        }else{
            System.out.println("Both String are equal.");
        }
    }
}