public class Security extends Park {
    private String officerName;
    private String securityLevel;
    private boolean camerasActive;
    private String identity; 

    public Security(String officerName, String securityLevel, boolean camerasActive) {
        this.officerName = officerName;
        this.securityLevel = securityLevel;
        this.camerasActive = camerasActive;
        identity = "security";
    }

    @Override
    public String toString() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        return "🔐 Security Station Info 🔐\n" +
               "Officer on Duty: " + officerName + "\n" +
               "Security Level: " + securityLevel + "\n" +
               "Cameras Active: " + (camerasActive ? "Yes ✅" : "No ❌");
    }
    public String getIdentity(){
        return identity; 
    }
}
