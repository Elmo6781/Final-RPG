public class Create {
    private String[][] park;
    private String[] locations;

    public Create(String[][] p, String[] l )
    {
        park = p;
        locations = l;

    }

    public String[][] PopulateArray()
    {
        int positionX = 0;
        int positionY = 0;
        boolean placed = false;
        int added = 0;

        for (String place: locations)
        {
            while(!placed)
            {
                positionX = (int) (Math.random()*(park.length));
                positionY = (int) (Math.random()*(park[0].length));
                if (park[positionX][positionY] == null)
                {
                    //Checks for corners
                    if(((positionX == 0  && positionY ==0) || (positionX == 0  && positionY == park[0].length -1) || (positionX == park.length -1   && positionY ==0) || (positionX == park.length -1  && positionY == park[0].length -1)))
                    {
                        if((park[Math.abs(positionX -1)][positionY] == null) && (park[positionX][Math.abs(positionY-1)] == null))
                        {park[positionX][positionY] = place; placed = true;}

                    }
                    //Checks for vertices
                    else if(positionX == 0)
                    {
                        if((park[positionX][positionY-1] == null) && (park[positionX+1][positionY] == null) && (park[positionX][positionY+1] == null) )
                        {park[positionX][positionY] = place; placed = true;}
                        
                    }
                    else if (positionY == park[0].length -1)
                    {
                        if((park[positionX-1][positionY] == null) && (park[positionX+1][positionY] == null) && (park[positionX][positionY-1] == null) )
                        {park[positionX][positionY] = place; placed = true;}

                    }
                    else if(positionY == 0)
                    {
                        if((park[positionX-1][positionY] == null) && (park[positionX+1][positionY] == null) && (park[positionX][positionY+1] == null) )
                        {park[positionX][positionY] = place; placed = true;}

                    }
                    else if(positionX == park.length -1)
                    {
                        if((park[positionX][positionY+1] == null) && (park[positionX-1][positionY] == null) && (park[positionX][positionY-1] == null) )
                        {park[positionX][positionY] = place; placed = true;}

                    }
                    else
                    {
                        if(park[positionX+1][positionY] != null || park[positionX-1][positionY] != null || park[positionX][positionY+1] != null || park[positionX+1][positionY-1] != null)
                        {park[positionX][positionY] = place; placed = true;}

                    }
                }
            }
            placed = false;
            added = 0;
            while(added <6)
            {
                positionX = (int) (Math.random()*(park.length));
                positionY = (int) (Math.random()*(park[0].length));
                if (park[positionX][positionY] == null) {
                    // Top-left corner
                    if (positionX == 0 && positionY == 0) {
                        if ((park[1][0] == null || place.equals(park[1][0])) &&
                            (park[0][1] == null || place.equals(park[0][1])) &&
                            (place.equals(park[1][0]) || place.equals(park[0][1]))) {
                            park[positionX][positionY] = place;
                            added += 1;
                        }
                    }
                    // Top-right corner
                    else if (positionX == 0 && positionY == park[0].length - 1) {
                        if ((place.equals(park[0][positionY - 1]) || place.equals(park[0][positionY])) &&
                            (park[1][positionY] == null || place.equals(park[1][positionY])) &&
                            (park[1][positionY - 1] == null || place.equals(park[1][positionY - 1]))) {
                            park[positionX][positionY] = place;
                            added += 1;
                        }
                    }
                    // Bottom-left corner
                    else if (positionX == park.length - 1 && positionY == 0) {
                        if ((place.equals(park[positionX][0]) || place.equals(park[positionX - 1][0])) &&
                            (park[positionX][1] == null || park[positionX - 1][1] == null)) {
                            park[positionX][positionY] = place;
                            added += 1;
                        }
                    }
                    // Bottom-right corner
                    else if (positionX == park.length - 1 && positionY == park[0].length - 1) {
                        if ((place.equals(park[positionX][positionY - 1]) || place.equals(park[positionX - 1][positionY])) &&
                            (park[positionX][positionY - 1] == null || park[positionX - 1][positionY] == null)) {
                            park[positionX][positionY] = place;
                            added += 1;
                        }
                    }
                    // Top edge (not corner)
                    else if (positionX == 0) {
                        if ((park[0][positionY - 1] == null || place.equals(park[0][positionY - 1])) &&
                            (park[0][positionY + 1] == null || place.equals(park[0][positionY + 1])) &&
                            (park[1][positionY] == null || place.equals(park[1][positionY])) &&
                            (place.equals(park[0][positionY - 1]) || place.equals(park[0][positionY + 1]) || place.equals(park[1][positionY]))) {
                            park[positionX][positionY] = place;
                            added += 1;
                        }
                    }
                    // Bottom edge (not corner)
                    else if (positionX == park.length - 1) {
                        if ((place.equals(park[positionX][positionY - 1]) || place.equals(park[positionX][positionY + 1]) || place.equals(park[positionX - 1][positionY])) &&
                            (park[positionX][positionY + 1] == null || place.equals(park[positionX][positionY + 1])) &&
                            (park[positionX][positionY - 1] == null || place.equals(park[positionX][positionY - 1])) &&
                            (park[positionX - 1][positionY] == null || place.equals(park[positionX - 1][positionY]))) {
                            park[positionX][positionY] = place;
                            added += 1;
                        }
                    }
                    // Left edge (not corner)
                    else if (positionY == 0) {
                        if ((place.equals(park[positionX + 1][0]) || place.equals(park[positionX - 1][0]) || place.equals(park[positionX][1])) &&
                            (park[positionX + 1][0] == null || place.equals(park[positionX + 1][0])) &&
                            (park[positionX - 1][0] == null || place.equals(park[positionX - 1][0])) &&
                            (park[positionX][1] == null || place.equals(park[positionX][1]))) {
                            park[positionX][positionY] = place;
                            added += 1;
                        }
                    }
                    // Right edge (not corner)
                    else if (positionY == park[0].length - 1) {
                        if ((place.equals(park[positionX - 1][positionY]) || place.equals(park[positionX + 1][positionY]) || place.equals(park[positionX][positionY - 1])) &&
                            (park[positionX - 1][positionY] == null || place.equals(park[positionX - 1][positionY])) &&
                            (park[positionX + 1][positionY] == null || place.equals(park[positionX + 1][positionY])) &&
                            (park[positionX][positionY - 1] == null || place.equals(park[positionX][positionY - 1]))) {
                            park[positionX][positionY] = place;
                            added += 1;
                        }
                    }
                    // All other middle cells
                    else {
                        if ((place.equals(park[positionX + 1][positionY]) || place.equals(park[positionX - 1][positionY]) || place.equals(park[positionX][positionY - 1]) || place.equals(park[positionX][positionY + 1])) &&
                            (park[positionX + 1][positionY] == null || place.equals(park[positionX + 1][positionY])) &&
                            (park[positionX - 1][positionY] == null || place.equals(park[positionX - 1][positionY])) &&
                            (park[positionX][positionY + 1] == null || place.equals(park[positionX][positionY + 1])) &&
                            (park[positionX][positionY - 1] == null || place.equals(park[positionX][positionY - 1]))) {
                            park[positionX][positionY] = place;
                            added += 1;
                        }
                    }
                }
                
                
                

            }


        }
        return park;
    }

    public void printPark(String[][] park) {
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length; j++) {
                if (park[i][j] == null) {
                    System.out.print("[ ]");
                } else {
                    System.out.print("[" + park[i][j] + "]");
                }
            }
            System.out.println(); // Move to next line after each row
        }
    }
    

    public String[][] getPark() {
        return park;
    }

    public String[] getLocations() {
        return locations;
    }
    public static void main(String[] args) {
        String[][] offpark = new String[15][15];
        String[] locations = {"P", "R", "H", "S"};

        Create test = new Create(offpark, locations );
        offpark = test.PopulateArray();
        test.printPark(offpark);
    }


    
    
}
