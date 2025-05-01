public class Paddock extends Park{
    protected Dino dinosaur;
    protected String supervisor;
    protected String security_level;


    public Paddock(Dino D, String s, String sl){
        dinosaur = D;
        supervisor = s;
        security_level = sl;
    }
    @Override
    public String toString() {
        return "Paddock {" +
               "dinosaur=" + (dinosaur != null ? dinosaur.toString() : "null") + ", " +
               "supervisor='" + supervisor + '\'' + ", " +
               "security_level='" + security_level + '\'' +
               '}';
    }
    
    

}