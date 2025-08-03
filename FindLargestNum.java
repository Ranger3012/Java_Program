
import java.util.Scanner;

public class FindLargestNum{
    public static void main(String[] args) {
        int x, y, z;
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if(x>y && y>z){
            System.out.println("x :" +x+ " is Largest.");
        }else if(y>x && y>z){
            System.out.println("y : " +y+ " is Largest.");
        }else if(z>x && z>y){
            System.out.println("z : " +z+ " is Largest.");
        }else{
            System.out.println("Numbers are same!");
        }
    }
}