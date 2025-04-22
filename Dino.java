public class Dino{
  protected String age;
  protected String occurrence_no;
  protected String name;
  protected String era; 
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
  public Dino(String age, String occurrence_no, String name, String era, String diet, String type, String length_m,
		String max_ma, String min_ma, String region, String lng, String lat, String class1, String family) {
	this.age = age;
	this.occurrence_no = occurrence_no;
	this.name = name;
	this.era = era;
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
    Dino[] finalList = new Dino[database.length];
    for(int i = 0; i < database.length; i++)
    {
      finalList[i] = new Dino("9", database[i][0], database[i][1], database[i][2], database[i][3], database[i][4], database[i][5], database[i][6], database[i][7], database[i][8], database[i][9], database[i][10], database[i][11], database[i][12]);
    }
  


    return null;
  }



  public String getAge() {
	return age;
  }



  public void setAge(String age) {
	this.age = age;
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



  public String getEra() {
	return era;
  }



  public void setEra(String era) {
	this.era = era;
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


  




}