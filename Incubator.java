public class Incubator extends Park
{
    private Dino newborn;
    private String temp;
    private String days_to_hatch;

    public Incubator(Dino d, String t, String dth)
    {
        newborn = d;
        temp = t;
        days_to_hatch = dth;
    }


}