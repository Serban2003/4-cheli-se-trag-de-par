package aut.utcluj.isp.ex2;

/**
 * @author stefan
 */
public class Equipment {
    private String name;
    private String serialNumber;

    public Equipment(String serialNumber) {
        this.name = "NONE";
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Equipment(String name, String serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }

    public Equipment() {

    }

    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
