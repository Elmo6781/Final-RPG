import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] buildings = {"I", "P", "R","M"};
        String[][] P = new String[20][20];

        
        Create gamePark = new Create(P, buildings);
        P = gamePark.PopulateArray();






        
    }
}