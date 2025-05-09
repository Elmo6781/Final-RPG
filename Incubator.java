public class Incubator extends Park
{
    private Dino newborn;
    private String temp;
    private String days_to_hatch;
    private String identity;

    public Incubator(Dino d, String t, String dth)
    {
        newborn = d;
        temp = t;
        days_to_hatch = dth;
        identity = "incubator";
    }
    @Override
    public String toString() {
        System.out.println();
        System.out.println();
        return "Incubator {" +
               "newborn=" + (newborn != null ? newborn.toString() : "null") + ", " +
               "temp='" + temp + '\n' + 
               "days_to_hatch='" + days_to_hatch +
               '}';
    }
    public String getIdentity(){
        return identity; 
    }
    

}