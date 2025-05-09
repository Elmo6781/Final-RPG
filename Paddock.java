public class Paddock extends Park{
    protected Dino dinosaur;
    protected String supervisor;
    protected String security_level;
    private String identity;


    public Paddock(Dino D, String s, String sl){
        dinosaur = D;
        supervisor = s;
        security_level = sl;
        identity = "paddock"; 
    }
    @Override
    public String toString() {
<<<<<<< HEAD
        System.out.println("");
        System.out.println("");
        System.out.println("");
=======
        System.out.println();
        System.out.println();
>>>>>>> refs/remotes/origin/main
        return "Paddock {" +
               "dinosaur=" + (dinosaur != null ? dinosaur.toString() : "null") + "\n" +
               "supervisor='" + supervisor + '\n' +
               "security_level='" + security_level +
               '}';
    }
    public String getIdentity(){
        return identity; 
    }
    
    

}