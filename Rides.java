public class Rides extends Park {
    private String rideName;
    private String rideType;
    private int minHeightRequirement; // in centimeters
    private boolean isOperational;
    private String identity; 

    public Rides(String rideName, String rideType, int minHeightRequirement, boolean isOperational) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.minHeightRequirement = minHeightRequirement;
        this.isOperational = isOperational;
        identity = "ride";
    }

    @Override
    public String toString() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        return "Rides {" +  '\n' +
               "rideName='" + rideName + '\n' +  
               ", rideType='" + rideType + '\n' +
               ", minHeightRequirement=" + minHeightRequirement + " cm" +  '\n'+
               ", isOperational=" + isOperational +
               '}';
    }
    public String getIdentity(){
        return identity; 
    }
}
