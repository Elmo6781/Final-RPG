public class Paddock extends Park{
    private Dino dinosaur;
    private String security;
    private String trainer;
    private String passcode;
    private double brain_activity;
    private double heart_rate;


    public Paddock(Dino D, String s, String t, String p){
        dinosaur = D;
        security = s;
        trainer = t;
        passcode = p;
    }

    public String tranquilize_dinosaur(Dino dino) {

        return "";

    }



    /* Methods to obtain primary information like attributes of the dinos in the paddoks
    */
    public String ToString(){
        return"";

    }

    public Dino getDinosaur() {
        return dinosaur;
    }

    public void setDinosaur(Dino dinosaur) {
        this.dinosaur = dinosaur;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }
    




}