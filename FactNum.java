
import java.util.Scanner;

public class FactNum{
    public static void main(String[] args) {
        int num, fact = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Num: ");
        num = sc.nextInt();

        if(num<0){
            System.out.println("Number should be greater than zero.");
        }else{
            for(int i = 1; i<= num; i++){
                fact = fact*i;
            }
            System.out.println("Factorial of Number: " +num+ " is : "+fact);
        }
    }
}