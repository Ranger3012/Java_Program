
import java.util.Scanner;

public class IfCondition2{
    public static void main(String[] args) {
        int marksGot, goodMarks = 85;
        Scanner in = new Scanner(System.in);

        marksGot = in.nextInt();

        if(marksGot >= goodMarks){
            System.out.println("Empressive!");
        }else{
            System.out.println("Work Hard!");
        }

    }
}