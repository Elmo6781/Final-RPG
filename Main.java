import java.util.Scanner;
import java.util.ArrayList;


public class Main{
    // Add a feature to the map where the player can only make the region visible when they land on them 
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


        // park[positionY][positionX]
        // 1 -> if (postion x +1) < 0 

        //right -> add 1 to the x value
        //left -> subtract 1 from the x value
        // up -> add one the y value
        // down -> subtract 1 from the y value

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

        System.out.println("Intialising park.....................");
        System.out.println("");
         System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");


        String[][] data = statsSheet.readCSV("/workspaces/Final-RPG/dinosaurs.csv");
        String[][] arrayToBeTranslated = translatePark.PopulateArray();
        String detect;
        int random_Dino;

        for(int i = 0; i<arrayToBeTranslated.length; i++)
        {
            for(int j = 0; j<arrayToBeTranslated[0].length; j++)            
            {
                if (arrayToBeTranslated[i][j] != null)
                {
                    if (arrayToBeTranslated[i][j].equals(testSubjects[0]))
                    {
                        random_Dino = (int) (1+(Math.random()*(data.length-1)));
                        detect = data[random_Dino][2];

                       if (detect.equals("carnivorous"))
                       { 
                        check = new Carnivore("9", data[random_Dino][0], data[random_Dino][1], data[random_Dino][2], data[random_Dino][3], data[random_Dino][4], data[random_Dino][5], data[random_Dino][6], data[random_Dino][7], data[random_Dino][8], data[random_Dino][9], data[random_Dino][10], data[random_Dino][11], data[random_Dino][12]);
                        check.addedtoDatabse();
                        game[i][j] = new Paddock(check, "Owen Grady", "factor 5");
                        
                       }
                       else if (detect.equals("herbivorous"))
                       {
                        check = new Herbivore("9", data[random_Dino][0], data[random_Dino][1], data[random_Dino][2], data[random_Dino][3], data[random_Dino][4], data[random_Dino][5], data[random_Dino][6], data[random_Dino][7], data[random_Dino][8], data[random_Dino][9], data[random_Dino][10], data[random_Dino][11], data[random_Dino][12]);
                        check.addedtoDatabse();
                        game[i][j] = new Paddock(check, "Owen Grady", "factor 5");

                       }
                       else if (detect.equals("omnivorous"))
                       {
                        check = new Omnivores("9", data[random_Dino][0], data[random_Dino][1], data[random_Dino][2], data[random_Dino][3], data[random_Dino][4], data[random_Dino][5], data[random_Dino][6], data[random_Dino][7], data[random_Dino][8], data[random_Dino][9], data[random_Dino][10], data[random_Dino][11], data[random_Dino][12]);
                        check.addedtoDatabse();
                        game[i][j] = new Paddock(check, "Owen Grady", "factor 5");

                       }



                    } 
                    else if (arrayToBeTranslated[i][j].equals(testSubjects[1]))
                    {
                        random_Dino = (int) (1+(Math.random()*(data.length-1)));
                        detect = data[random_Dino][2];

                       if (detect.equals("carnivorous"))
                       { 
                        check = new Carnivore("9", data[random_Dino][0], data[random_Dino][1], data[random_Dino][2], data[random_Dino][3], data[random_Dino][4], data[random_Dino][5], data[random_Dino][6], data[random_Dino][7], data[random_Dino][8], data[random_Dino][9], data[random_Dino][10], data[random_Dino][11], data[random_Dino][12]);
                        check.addedtoDatabse();
                        game[i][j] = new Incubator(check, "45", "22");
                        
                       }
                       else if (detect.equals("herbivorous"))
                       {
                        check = new Herbivore("9", data[random_Dino][0], data[random_Dino][1], data[random_Dino][2], data[random_Dino][3], data[random_Dino][4], data[random_Dino][5], data[random_Dino][6], data[random_Dino][7], data[random_Dino][8], data[random_Dino][9], data[random_Dino][10], data[random_Dino][11], data[random_Dino][12]);
                        check.addedtoDatabse();
                        game[i][j] = new Incubator(check, "45", "22");

                       }
                       else if (detect.equals("omnivorous"))
                       {
                        check = new Omnivores("9", data[random_Dino][0], data[random_Dino][1], data[random_Dino][2], data[random_Dino][3], data[random_Dino][4], data[random_Dino][5], data[random_Dino][6], data[random_Dino][7], data[random_Dino][8], data[random_Dino][9], data[random_Dino][10], data[random_Dino][11], data[random_Dino][12]);
                        check.addedtoDatabse();
                        game[i][j] = new Incubator(check, "45", "22");

                       }


                    } 
                    else if(arrayToBeTranslated[i][j].equals(testSubjects[2]))
                    {
                        game[i][j] = new Security("Ranger Dave", "High", true);


                    }
                    else if (arrayToBeTranslated[i][j].equals(testSubjects[3]))
                    {
                        game[i][j] = new Rides("T-Rex Twister", "Rollercoaster", 120, true);
                        
                    }

                }
                

            }
        }

        

        boolean movement = false;
        int positionX = 0;
        int positionY = 0;
        int numSpotsVisited = 0;
        // write a program that uses variable position x to move left and right, poistion y to move up and down 
        // The intial position is [0,0]   ask for user input 1 for up 2 for down 3 for left and 4 for right
        // watches out for put of bound err0rs
        translatePark.printPark(arrayToBeTranslated);
        String lastTile = arrayToBeTranslated[0][0]; // Save what was at the initial position
        arrayToBeTranslated[positionY][positionX] = "X"; // Mark starting position

        System.out.println("Welcome to Jurrasic World");
        
        boolean gameRunning = true;
        while (gameRunning) 
        {
            System.out.println("Enter 1 to move left, 2 to move right, 3 to move down, 4 to move up and enter 5 to stop");
            int response = Integer.parseInt(in.nextLine());
            while (response !=1 || response !=2 || response !=3|| response !=4 | response!=5)
            { 
                System.out.println("Invalid input, try again ");
                System.out.println("Enter 1 to move left, 2 to move right, 3 to move down, 4 to move up and enter 5 to stop");
                response = Integer.parseInt(in.nextLine());

            }
            while(movement)
            {
                if (response == 1)
                {
                    if ((positionX -1) <0){
                        System.out.println("Invalid movement, try again ");
                        System.out.println("Enter 1 to move left, 2 to move right, 3 to move down, 4 to move up and enter 5 to stop");
                        response = Integer.parseInt(in.nextLine());

                    }
                    else {positionX -= 1;}
                }
                else if (response == 2)
                {
                    if ((positionX +1) >  game[0].length - 1){
                        System.out.println("Invalid movement, try again ");
                        System.out.println("Enter 1 to move left, 2 to move right, 3 to move down, 4 to move up and enter 5 to stop");
                        response = Integer.parseInt(in.nextLine());

                    }
                    else {positionX ++;}
                }
                else if (response == 3)
                {
                    if ((positionY +1) >  game.length -1){
                        System.out.println("Invalid movement, try again ");
                        System.out.println("Enter 1 to move left, 2 to move right, 3 to move down, 4 to move up and enter 5 to stop");
                        response = Integer.parseInt(in.nextLine());

                    }
                    else{positionY++;}
                }
                else if (response == 4)
                {
                    if ((positionY -1) <0){
                        System.out.println("Invalid movement, try again ");
                        System.out.println("Enter 1 to move left, 2 to move right, 3 to move down, 4 to move up and enter 5 to stop");
                        response = Integer.parseInt(in.nextLine());

                    }
                    else{positionY--;}
                }

            }
            if (game[positionY][positionX] != null){
                if(!game[positionY][positionX].getVisited())
                {
                    game[positionY][positionX].hasVisited();
                    numSpotsVisited++;
                    game[positionY][positionX].toString();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                }
            }



        }
        
  

}
}