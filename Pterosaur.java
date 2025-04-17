public class Pterosaur extends Dino{
    private String info; 
  
    public Pterosaur(int a, String n, String e, String i){
      super(a, n, e);
      info = i;
  }
  
  public String getInfo(){
      return info; 
  }
  public void setInfo(String newI){
      info = newI; 
  }
  @Override
  public String toString(){
      return "Welcome to the " + name + " paddock! This dinosaur is " + age + " years old originating from the " + era + "!" + info;
  }
}
  