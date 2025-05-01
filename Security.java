public class Security extends Park {
    private String officerName;
    private String securityLevel;
    private boolean camerasActive;

    public Security(String officerName, String securityLevel, boolean camerasActive) {
        this.officerName = officerName;
        this.securityLevel = securityLevel;
        this.camerasActive = camerasActive;
    }

    @Override
    public String toString() {
        return "🔐 Security Station Info 🔐\n" +
               "Officer on Duty: " + officerName + "\n" +
               "Security Level: " + securityLevel + "\n" +
               "Cameras Active: " + (camerasActive ? "Yes ✅" : "No ❌");
    }
}
