public class Rides extends Park {
    private String rideName;
    private String rideType;
    private int minHeightRequirement; // in centimeters
    private boolean isOperational;

    public Rides(String rideName, String rideType, int minHeightRequirement, boolean isOperational) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.minHeightRequirement = minHeightRequirement;
        this.isOperational = isOperational;
    }

    @Override
    public String toString() {
        return "Rides {" +
               "rideName='" + rideName + '\'' +
               ", rideType='" + rideType + '\'' +
               ", minHeightRequirement=" + minHeightRequirement + " cm" +
               ", isOperational=" + isOperational +
               '}';
    }
}
