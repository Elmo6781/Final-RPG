public class Pterosaur extends Dino{
    public Pterosaur(String age,String occurrence_no,String name,String era,String diet,String type,String length_m,String max_ma,String min_ma, String region, String lng,String  lat, String dinoClass, String  family)
    {super(age, occurrence_no, name, era, diet, type, length_m, max_ma, min_ma, region, lng, lat, dinoClass, family);}
    public String toString(){
        return "Meet " + name + " , a fascinating dinosaur from the " + era + " era!\n" +
            "🦖 Name: " + name + "\n" +
            "📅 Age: " + age + occurrence_no + "\n" +
            "🌍 Region: " + region + "[Longitude: " + lng + " Latitude: " + lat + "]" + "\n" +
            "📏 Length: " + length_m + "\n" +
            "🦴 Type: " + type + " | Class: " + dinoClass + " | Family: " + family + "\n" +
            "🍽 Diet: " + diet + "\n" +
            "🕰 Time Range: " + min_ma + " to " + max_ma + " million years ago" + "\n";
     }
}
  