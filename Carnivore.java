public class Carnivore extends Dino{
    private String info;

    public Carnivore(int a, String n, String e, String i){
        super(a, n, e);    
        info = i;   
    }
    
    public String getInfo(){
        Return info; 
    }
    public void setInfo(int newI){
        Info = newI; 
    }
    @Override         
    public String toString(){
        return "Welcome to the " + name + " paddock! This dinosaur is " + age + " years old originating from the " + era + "!" + info;
    }

}
    
    
    
    
    
    