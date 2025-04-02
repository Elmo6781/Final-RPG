public class Dino{
  private int age;
  private String name;
  private String era; 

public Dino(int a, String n, String e){
	age = a;
	name = n;
	era = e;
}


public int getAge(){
	return age; 
}
public String getName(){
	return name;
}
public String getEra(){
	return era;
}
public void setAge(int newA){
	age = newA;
}
public void setName(String newS){
	name = newS;
}
public void setEra(String newE){
	era = newE;
}
public String toString(){
	return "Welcome to the " + name + " paddock! This dinosaur is " + age + " years old the " + era + "!";
}
}