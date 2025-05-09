public class Park{
    private Park[][] finalPark;
    private boolean visited = false; 
    private String identity = "park";

    public void hasVisited(){visited = true;}
    public boolean getVisited(){return  visited;}
    public String getIdentity(){
        return identity; 
    }

}