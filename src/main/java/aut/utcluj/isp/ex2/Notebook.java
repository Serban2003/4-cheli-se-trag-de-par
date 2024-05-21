package aut.utcluj.isp.ex2;


/**
 * @author stefan
 */
public class Notebook extends Equipment {
    private String osVersion;
    private String serialNr;
    private String name;

    public Notebook(String name, String serialNumber, String osVersion) {
        super();
        this.name=name;
        this.serialNr=serialNumber;
        this.osVersion=osVersion;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public String start() {
        return "Notebook "+ this.name + " started";
    }
}
