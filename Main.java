import java.util.Scanner;
public class Main{
    // Add a feature to the map where the player can only make the region visible when they land on them 
    /**
     * @param args
     */
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Park[][] game = new Park[25][25];
        String[] testSubjects = {"P", "I", "L", "R"};
        Create translatePark = new Create(new String[25][25], args);
        String[][] arrayToBeTranslated = translatePark.PopulateArray();
        for(int i = 0; i<arrayToBeTranslated.length; i++)
        {
            for(int j = 0; j<arrayToBeTranslated[0].length; j++)
            {
                if (arrayToBeTranslated[i][j] != null)
                {
                    if (arrayToBeTranslated[i][j].equals(testSubjects[0]))
                    {

                    } 
                    else if (arrayToBeTranslated[i][j].equals(testSubjects[1]))
                    {

                    } 
                    else if(arrayToBeTranslated[i][j].equals(testSubjects[2]))
                    {

                    }
                    else if (arrayToBeTranslated[i][j].equals(testSubjects[3]))
                    {
                        
                    }

                }
                

            }
        }

        

        System.out.println("Welcome to Jurrasic Park! I'm Alan Grant, your personal tour guide.");
        System.out.println("-");
        System.out.println();
        System.out.println("Enter 1 to move left, 2 to move right, 3 to move up, 4 to move down");
        

        boolean movement = false;
        while(!movement)
        {
            int response =  Integer.parseInt(in.nextLine());

        }




        









        
        

    }

    //*public static String getResponse(int userResponse){if(userResponse == 1){} }*/
}