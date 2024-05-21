package aut.utcluj.isp.ex1;

/**
 * @author stefan
 */
public class Equipment {
    private String name;
    private String serialNumber;

    public Equipment(String serialNumber) {
        this.name="NONE";
        this.serialNumber=serialNumber;
    }

    public Equipment(String name, String serialNumber) {
        this.name=name;
        this.serialNumber=serialNumber;
    }

    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return name + "_" + serialNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Equipment other = (Equipment) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }

        if (this.serialNumber != other.serialNumber) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
