public class Main{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String[] buildings = {"I", "P", "R","M"};
        String[][] P = new String[20][20];
        int PositionRow  = (int) Math.random()*P.length;
        int PositionCol  = (int) Math.random()*P[0].length;

        
        Create gamePark = new Create(P, buildings);
        P = gamePark.PopulateArray();

        System.out.println("Welcome to Jurrasic Park! I'm Alan Grant, your personal tour guide.");
        System.out.println("-");
        System.out.println();
        System.out.println("Enter 1 to move left, 2 to move right, 3 to move up, 4 to move down");
        

        boolean movement = false;
        while(!movement)
        {
            int response =  Integer.parseInt(in.nextLine());

        }









        
<<<<<<< HEAD
=======
        

>>>>>>> 80457db (main change)
    }

    public static String getResponse(int userResponse){
        if(userResponse == 1){
            
        }
    }
}