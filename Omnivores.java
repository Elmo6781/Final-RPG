public class Omnivores extends Dino{
 public Omnivores(String occurrence_no,String name,String diet,String type,String length_m,String max_ma,String min_ma, String region, String lng,String  lat, String dinoClass, String  family)
 {super( occurrence_no, name, diet, type, length_m, max_ma, min_ma, region, lng, lat, dinoClass, family);}

 public String toString(){
    return
        "🦖 Name: " + name + "\n" +
        "🌍 Region: " + region + "[Longitude: " + lng + " Latitude: " + lat + "]" + "\n" +
        "📏 Length: " + length_m + "\n" +
        "🦴 Type: " + type + " | Class: " + dinoClass + "\n" +
        "🍽 Diet: " + diet + "\n" +
        "🕰 Time Range: " + min_ma + " to " + max_ma + " million years ago" + "\n";
 }
 public void addedtoDatabse(){
    System.out.println("An omnivore has been exported to the map!!!!");
}

}
  