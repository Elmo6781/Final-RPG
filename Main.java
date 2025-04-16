import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String[] buildings = {"I", "P", "R","M"};
        String[][] P = new String[20][20];
        int xPosition = (int) Math.random()*P.length;
        int yPosition = (int) Math.random()*P[0].length;

        
        Create gamePark = new Create(P, buildings);
        P = gamePark.PopulateArray();

        System.out.println("Welcome to Jurrasic Park! I'm Alan Grant, your personal tour guide.");
        System.out.println("-");
        System.out.println();
        System.out.println("Enter 1 to move left, 2 to move right, 3 to move up, 4 to move down");
        int respone =  Integer.parseInt(in.nextLine());

        boolean movement = false;
        while(!movement)
        {
            
        }








        
    }
}