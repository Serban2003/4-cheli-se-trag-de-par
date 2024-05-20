package aut.utcluj.isp.ex3;

/**
 * @author stefan
 */
public class Equipment {
    private String name;
    private String serialNumber;
    private String owner;
    private boolean taken;

    public Equipment(String serialNumber) {
        this.name = null;
        this.serialNumber = serialNumber;
        this.owner = null;
        this.taken = false;
    }

    public Equipment(String name, String serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.owner = null;
        this.taken = false;
    }

    public Equipment(String name, String serialNumber, String owner) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.owner = owner;
        this.taken = false;
    }

    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getOwner() {
        return owner;
    }

    public boolean isTaken() {
        return taken;
    }
    
    public void provideEquipmentToUser(final String owner) {
        this.owner = owner;
        this.taken = true;
    }

    public void returnEquipmentToOffice() {
        this.owner = null;
        this.taken = false;
    }
}
