
public class Tablet extends Device {
    private String operatingSystem;
    private boolean hasCellular;

    public Tablet(String type, double price, double weight, String operatingSystem, boolean hasCellular) {
        super(type, price, weight);
        this.operatingSystem = operatingSystem;
        this.hasCellular = hasCellular;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public boolean hasCellular() {
        return hasCellular;
    }

    public void setHasCellular(boolean hasCellular) {
        this.hasCellular = hasCellular;
    }

    @Override
    public String toString() {
        return super.toString() + ", Operating System: " + operatingSystem + ", Cellular: " + (hasCellular ? "Yes" : "No");
    }
}
