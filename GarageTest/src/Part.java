/**
 * This file is a part of GarageTest project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class Part {
    protected final String sparePartsName;
    protected boolean fixed;

    public Part(String sparePartsName, boolean fixed) {
        this.sparePartsName = sparePartsName;
        this.fixed = fixed;
    }

    public String getSparePartsName() {
        return sparePartsName;
    }

    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }

    public void fix() {
        fixed = true;
    }

    public boolean isFixed() {
        return fixed;
    }

    @Override
    public String toString() {
        return "Part{" +
                "sparePartsName='" + sparePartsName + '\'' +
                ", fixed=" + fixed +
                '}';
    }
}


