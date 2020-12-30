/**
 * This file is a part of GarageTest project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class Mechanic {
    private OnPartFixedListener partFixedListener;

    public void setPartFixedListener(OnPartFixedListener partFixedListener) {
        this.partFixedListener = partFixedListener;
    }

    private void notifyFixed(Part part) {
        if (partFixedListener != null) {
            partFixedListener.onPartFixed(part);
        }
    }

    public void fix(Vehicle vehicle) {
        Part[] parts = vehicle.getCarParts();
        int partToFix = (int) (Math.random() * vehicle.getCountDamagedCarParts() + 1);

        System.out.printf(" Mechanic: i'm going to fix %d parts\n ", partToFix);

        for (int i = 0; i < parts.length && partToFix > 0; i++) {
            Part part = parts[i];
            if (part != null && !part.isFixed()) {
                part.fix();
                notifyFixed(part);
                --partToFix;
            }
        }
    }
}
