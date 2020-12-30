

/**
 * This file is a part of GarageTest project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class Vehicle {

    private final String carBrand;
    private Part[] carParts;

    public Vehicle(String carBrand, Part[] carParts) {
        this.carBrand = carBrand;
        this.carParts = carParts;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public Part[] getCarParts() {
        return carParts;
    }

    public void setCarParts(Part[] carParts) {
        this.carParts = carParts;
    }

    public int getCountDamagedCarParts() {
        int count = 0;
        for (Part carPart : carParts) {
            if (carPart != null && !carPart.isFixed()) {
                count++;
            }
        }
        return count;
    }

    public boolean isFixed() {
        boolean fixed = true;
        for (int i = 0; i < carParts.length && fixed; i++) {
            Part carPart = carParts[i];
            if (carPart != null) {
                fixed = carParts[i].isFixed();
            }
        }
        return fixed;
    }

    @Override
    public String toString() {
        return  carBrand;
    }
}

