

public class PrintStarUsingLoop1{
    public static void main(String[] args) {
        
        int row;

        for(row = 1; row <= 10; row++){
            for(int numberOfStar = 1; numberOfStar<=row; numberOfStar++){
                System.out.print("$");
         }
         System.out.println();

        }
        
    }
}