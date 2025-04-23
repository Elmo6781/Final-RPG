import java.util.Scanner;
import java.util.ArrayList;


public class Main{
    // Add a feature to the map where the player can only make the region visible when they land on them 
    /**
     * @param args
     */
    public static void main(String[] args){


        // park[positionY][positionX]
        // 1 -> if (postion x +1) < 0 
        int positionX = 0;
        int positionY = 0;
        //right -> add 1 to the x value
        //left -> subtract 1 from the x value
        // up -> add one the y value
        // down -> subtract 1 from the y value
        Scanner in = new Scanner(System.in);
        Park[][] game = new Park[25][25];
        String[] testSubjects = {"P", "I", "S", "R"};
        ArrayList<String> trainers = new ArrayList<>();
        trainers.add("Owen Grady");
        trainers.add("Ash Ketchum");
        trainers.add("Lawrence");
        Create translatePark = new Create(new String[25][25], testSubjects);
        DinoDownloader statsSheet = new DinoDownloader();
        Dino check = new Dino();
        System.out.println("Intialising park.....................");
        Dino[] dinoList =  check.createListDino();
        try {
            Thread.sleep(2000); // Wait for 2000 milliseconds (2 seconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        String[][] data = statsSheet.readCSV("/workspaces/Final-RPG/dinosaurs.csv");
        String[][] arrayToBeTranslated = translatePark.PopulateArray();

        for(int i = 0; i<arrayToBeTranslated.length; i++)
        {
            for(int j = 0; j<arrayToBeTranslated[0].length; j++)            
            {
                if (arrayToBeTranslated[i][j] != null)
                {
                    if (arrayToBeTranslated[i][j].equals(testSubjects[0]))
                    {
                       String detect = data[3][(int) (Math.random()*data.length)];
                       if (detect.equals("carnivorous"))
                       { 
                        
                       }


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