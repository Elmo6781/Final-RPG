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


        
        Create translatePark = new Create(new String[25][25], testSubjects);
        DinoDownloader statsSheet = new DinoDownloader();
        Dino check = new Dino();

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
                    random_Dino =(int) (1+(Math.random()*(data.length-1)));
                    if (arrayToBeTranslated[i][j].equals(testSubjects[0]))
                    {
                        detect = data[random_Dino][2];

                       if (detect.equals("carnivorous"))
                       { 
                        check = new Carnivore(data[random_Dino][0], data[random_Dino][1], data[random_Dino][2], data[random_Dino][3], data[random_Dino][4], data[random_Dino][5], data[random_Dino][6], data[random_Dino][7], data[random_Dino][8], data[random_Dino][9], data[random_Dino][10], data[random_Dino][10]);
                        check.addedtoDatabse();
                        game[i][j] = new Paddock(check, "Owen Grady", "factor 5");
                        
                       }
                       else if (detect.equals("herbivorous"))
                       {
                        check = new Herbivore(data[random_Dino][0], data[random_Dino][1], data[random_Dino][2], data[random_Dino][3], data[random_Dino][4], data[random_Dino][5], data[random_Dino][6], data[random_Dino][7], data[random_Dino][8], data[random_Dino][9], data[random_Dino][10], data[random_Dino][10]);
                        check.addedtoDatabse();
                        game[i][j] = new Paddock(check, "Owen Grady", "factor 5");

                       }
                       else if (detect.equals("omnivorous"))
                       {
                        check = new Omnivores(data[random_Dino][0], data[random_Dino][1], data[random_Dino][2], data[random_Dino][3], data[random_Dino][4], data[random_Dino][5], data[random_Dino][6], data[random_Dino][7], data[random_Dino][8], data[random_Dino][9], data[random_Dino][10], data[random_Dino][10]);
                        check.addedtoDatabse();
                        game[i][j] = new Paddock(check, "Owen Grady", "factor 5");

                       }
                       else 
                       {
                        check = new Omnivores(data[random_Dino][0], data[random_Dino][1], data[random_Dino][2], data[random_Dino][3], data[random_Dino][4], data[random_Dino][5], data[random_Dino][6], data[random_Dino][7], data[random_Dino][8], data[random_Dino][9], data[random_Dino][10], data[random_Dino][10]);
                        check.addedtoDatabse();
                        game[i][j] = new Incubator(check, "45", "22");



                       }



                    } 
                    else if (arrayToBeTranslated[i][j].equals(testSubjects[1]))
                    {
                        detect = data[random_Dino][2];

                       if (detect.equals("carnivorous"))
                       { 
                        check = new Carnivore(data[random_Dino][0], data[random_Dino][1], data[random_Dino][2], data[random_Dino][3], data[random_Dino][4], data[random_Dino][5], data[random_Dino][6], data[random_Dino][7], data[random_Dino][8], data[random_Dino][9], data[random_Dino][10], data[random_Dino][10]);
                        check.addedtoDatabse();
                        game[i][j] = new Incubator(check, "45", "22");
                        
                       }
                       else if (detect.equals("herbivorous"))
                       {
                        check = new Herbivore(data[random_Dino][0], data[random_Dino][1], data[random_Dino][2], data[random_Dino][3], data[random_Dino][4], data[random_Dino][5], data[random_Dino][6], data[random_Dino][7], data[random_Dino][8], data[random_Dino][9], data[random_Dino][10], data[random_Dino][10]);
                        check.addedtoDatabse();
                        game[i][j] = new Incubator(check, "45", "22");

                       }
                       else if (detect.equals("omnivorous"))
                       {
                        check = new Omnivores(data[random_Dino][0], data[random_Dino][1], data[random_Dino][2], data[random_Dino][3], data[random_Dino][4], data[random_Dino][5], data[random_Dino][6], data[random_Dino][7], data[random_Dino][8], data[random_Dino][9], data[random_Dino][10], data[random_Dino][10]);
                        check.addedtoDatabse();
                        game[i][j] = new Incubator(check, "45", "22");

                       }
                       else 
                       {
                        check = new Omnivores(data[random_Dino][0], data[random_Dino][1], data[random_Dino][2], data[random_Dino][3], data[random_Dino][4], data[random_Dino][5], data[random_Dino][6], data[random_Dino][7], data[random_Dino][8], data[random_Dino][9], data[random_Dino][10], data[random_Dino][10]);
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

        int positionX = 0;
        int positionY = 0;
        double numSpotsVisited = 0.0;
        double percentageCovered = 0.0;

        translatePark.printPark(arrayToBeTranslated);
        arrayToBeTranslated[positionY][positionX] = "X"; // Mark starting position

        System.out.println("Welcome to Jurrasic World");
        System.out.println("You start at the top left corner of the map ");

        boolean gameRunning = true;
        while (gameRunning) 
        {
            System.out.println();
            System.out.println("Enter 1 to move left, 2 to move right, 3 to move down, 4 to move up and enter 5 to stop");
            String response = in.nextLine();
            if(percentageCovered >= 100){
                System.out.println("You've explored the entire map!");
                gameRunning = false;
            }
            if (!response.equals("1") && !response.equals("2") && !response.equals("3")  && !response.equals("4")  && !response.equals("5") )
            { 
                System.out.println("Invalid input, try again ");

            }
            else if(response.equals("5")){

                System.out.println("Hope you had fun! Bye!");
                gameRunning = false;
            }
            else if (response.equals("1"))
                {
                    if ((positionX -1) <0){
                        System.out.println("Invalid movement, try again ");
                    }
                    else {
                        positionX -= 1; 
                        if(arrayToBeTranslated[positionY][positionX] == null){
                            arrayToBeTranslated[positionY][positionX] = "X";
                            translatePark.printPark(arrayToBeTranslated);
                            numSpotsVisited++;
                            System.out.println();
                            percentageCovered = (numSpotsVisited / 625) * 100;
                            System.out.println("Aw man there's nothing here... :(" + "\n" + "Percentage covered: " + percentageCovered + "%");
                        }
                        else if(arrayToBeTranslated[positionY][positionX].equals("X")){
                            System.out.println();
                            System.out.println();
                            translatePark.printPark(arrayToBeTranslated);
                            System.out.println();
                            System.out.println("You've visited here already!");
                        }      
                        else if(game[positionY][positionX].getIdentity().equals("paddock") || game[positionY][positionX].getIdentity().equals("incubator") || game[positionY][positionX].getIdentity().equals("ride") || game[positionY][positionX].getIdentity().equals("security")){
                            arrayToBeTranslated[positionY][positionX] = "X";
                            System.out.println();
                            System.out.println();
                            translatePark.printPark(arrayToBeTranslated);
                            numSpotsVisited++;
                            percentageCovered = (numSpotsVisited / 625) * 100;
                            System.out.println(game[positionY][positionX].toString());
                            System.out.println();
                            System.out.println("Percentage covered: " + percentageCovered + "%");
                            
                        }
                        
                    }
                }
                else if (response.equals("2"))
                {
                    if ((positionX +1) >  game[0].length - 1){
                        System.out.println("Invalid movement, try again ");

                    }
                    else {
                        positionX ++;
                        if(arrayToBeTranslated[positionY][positionX] == null){
                            arrayToBeTranslated[positionY][positionX] = "X";
                            System.out.println();
                            System.out.println();
                            translatePark.printPark(arrayToBeTranslated);
                            numSpotsVisited++;
                            percentageCovered = (numSpotsVisited / 625) * 100;
                            System.out.println();
                            System.out.println("Aw man there's nothing here... :(" + "\n" + "Percentage covered: " + percentageCovered + "%");
                        }
                        else if(arrayToBeTranslated[positionY][positionX].equals("X")){
                            System.out.println();
                            System.out.println();
                            translatePark.printPark(arrayToBeTranslated);
                            System.out.println();
                            System.out.println("You've visited here already!");
                        }      
                        else if(game[positionY][positionX].getIdentity().equals("paddock") || game[positionY][positionX].getIdentity().equals("incubator") || game[positionY][positionX].getIdentity().equals("ride") || game[positionY][positionX].getIdentity().equals("security")){
                            arrayToBeTranslated[positionY][positionX] = "X";
                            System.out.println();
                            System.out.println();
                            translatePark.printPark(arrayToBeTranslated);
                            numSpotsVisited++;
                            percentageCovered = (numSpotsVisited / 625) * 100;
                            System.out.println(game[positionY][positionX].toString());
                            System.out.println();
                            System.out.println("Percentage covered: " + percentageCovered + "%");
                        }
                        
                    }
                }
                else if (response.equals("3"))
                {
                    if ((positionY +1) >  game.length -1){
                        System.out.println("Invalid movement, try again ");
                    }
                    else{
                        positionY++;
                        if(arrayToBeTranslated[positionY][positionX] == null){
                            arrayToBeTranslated[positionY][positionX] = "X";
                            System.out.println();
                            System.out.println();
                            translatePark.printPark(arrayToBeTranslated);
                            numSpotsVisited++;
                            System.out.println();
                            percentageCovered = (numSpotsVisited / 625) * 100;
                            System.out.println("Aw man there's nothing here... :(" + "\n" + "Percentage covered: " + percentageCovered + "%");
                        }
                        else if(arrayToBeTranslated[positionY][positionX].equals("X")){
                            translatePark.printPark(arrayToBeTranslated);
                            System.out.println();
                            System.out.println("You've visited here already!");
                        }
                        else if(game[positionY][positionX].getIdentity().equals("paddock") || game[positionY][positionX].getIdentity().equals("incubator") || game[positionY][positionX].getIdentity().equals("ride") || game[positionY][positionX].getIdentity().equals("security")){
                            arrayToBeTranslated[positionY][positionX] = "X";
                            translatePark.printPark(arrayToBeTranslated);
                            numSpotsVisited++;
                            percentageCovered = (numSpotsVisited / 625) * 100;
                            System.out.println(game[positionY][positionX].toString());
                            System.out.println();
                            System.out.println("Percentage covered: " + percentageCovered + "%");
                        }
                    
                    }
                }
                else if (response.equals("4"))
                {
                    if ((positionY -1) <0){
                        System.out.println("Invalid movement, try again ");

                    }
                    else{
                        positionY--;
                        if(arrayToBeTranslated[positionY][positionX] == null){
                            arrayToBeTranslated[positionY][positionX] = "X";
                            translatePark.printPark(arrayToBeTranslated);
                            numSpotsVisited++;
                            percentageCovered = (numSpotsVisited / 625) * 100;
                            System.out.println();
                            System.out.println("Aw man there's nothing here... :(" + "\n" + "Percentage covered: " + percentageCovered + "%");
                        }
                        else if(arrayToBeTranslated[positionY][positionX].equals("X")){
                            translatePark.printPark(arrayToBeTranslated);
                            System.out.println();
                            System.out.println("You've visited here already!");
                        }      
                        else if(game[positionY][positionX].getIdentity().equals("paddock") || game[positionY][positionX].getIdentity().equals("incubator") || game[positionY][positionX].getIdentity().equals("ride") || game[positionY][positionX].getIdentity().equals("security")){
                            arrayToBeTranslated[positionY][positionX] = "X";
                            translatePark.printPark(arrayToBeTranslated);
                            numSpotsVisited++;
                            percentageCovered = (numSpotsVisited / 625) * 100;
                            System.out.println(game[positionY][positionX].toString());
                            System.out.println();
                            System.out.println("Percentage covered: " + percentageCovered + "%");
                        }
                        
                    }
                }

            }
           
            }



        }
        
  


