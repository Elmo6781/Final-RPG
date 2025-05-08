public class iDino{
  protected String occurrence_no;
  protected String name; 
  protected String diet;
  protected String type;
  protected String length_m;
  protected String max_ma;
  protected String min_ma;
  protected String region;
  protected String lng;
  protected String lat;
  protected String dinoClass;
  protected String family;



  // constructor 
  public Dino( String occurrence_no, String name, String diet, String type, String length_m,
		String max_ma, String min_ma, String region, String lng, String lat, String class1, String family) {

	this.occurrence_no = occurrence_no;
	this.name = name;
	this.diet = diet;
	this.type = type;
	this.length_m = length_m;
	this.max_ma = max_ma;
	this.min_ma = min_ma;
	this.region = region;
	this.lng = lng;
	this.lat = lat;
	dinoClass = class1;
	this.family = family;
  }

  public Dino(){}

  public Dino[] createListDino()
  {
    DinoDownloader useTest = new DinoDownloader();
    String[][] database = useTest.readCSV("/workspaces/Final-RPG/dinosaurs.csv");
    Dino[] finalList = new Dino[database.length- 1];
    for(int i = 1; i < finalList.length; i++)
    {
      finalList[i-1] = new Dino(database[i][0], database[i][1], database[i][2], database[i][3], database[i][4], database[i][5], database[i][6], database[i][7], database[i][8], database[i][9], database[i][10], database[i][11]);
    }
  


    return finalList;
  }
  public void addedtoDatabse(){
    System.out.println("A carnivore has been exported to the map!!!!");
  }






  public String getOccurrence_no() {
	return occurrence_no;
  }



  public void setOccurrence_no(String occurrence_no) {
	this.occurrence_no = occurrence_no;
  }



  public String getName() {
	return name;
  }



  public void setName(String name) {
	this.name = name;
  }






  public String getDiet() {
	return diet;
  }



  public void setDiet(String diet) {
	this.diet = diet;
  }



  public String getType() {
	return type;
  }



  public void setType(String type) {
	this.type = type;
  }



  public String getLength_m() {
	return length_m;
  }



  public void setLength_m(String length_m) {
	this.length_m = length_m;
  }



  public String getMax_ma() {
	return max_ma;
  }



  public void setMax_ma(String max_ma) {
	this.max_ma = max_ma;
  }



  public String getMin_ma() {
	return min_ma;
  }



  public void setMin_ma(String min_ma) {
	this.min_ma = min_ma;
  }



  public String getRegion() {
	return region;
  }



  public void setRegion(String region) {
	this.region = region;
  }



  public String getLng() {
	return lng;
  }



  public void setLng(String lng) {
	this.lng = lng;
  }



  public String getLat() {
	return lat;
  }



  public void setLat(String lat) {
	this.lat = lat;
  }



  public String getDinoClass() {
	return dinoClass;
  }



  public void setClass(String class1) {
	dinoClass = class1;
  }



  public String getFamily() {
	return family;
  }



  public void setFamily(String family) {
	this.family = family;
  }
  
  @Override
public String toString() {
    return "🦕 Dino Information 🦖\n" +
           "------------------------\n" +
           "Name: " + name + "\n" +
           "Diet: " + diet + "\n" +
           "Type: " + type + "\n" +
           "Length (m): " + length_m + "\n" +
           "Class: " + dinoClass + "\n" +
           "Family: " + family + "\n" +
           "Region: " + region + "\n" +
           "Latitude: " + lat + "\n" +
           "Longitude: " + lng + "\n" +
           "Min MA: " + min_ma + "\n" +
           "Max MA: " + max_ma + "\n" +
           "Occurrence #: " + occurrence_no + "\n";
}



  




}