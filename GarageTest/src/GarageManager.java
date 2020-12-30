/**
 * This file is a part of GarageTest project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class GarageManager implements OnPartFixedListener {

    public void handleVehicle(Vehicle vehicle) {
        while (!vehicle.isFixed()) {
            Mechanic mechanic = new Mechanic();
            mechanic.setPartFixedListener(this);
            mechanic.fix(vehicle);
        }
        System.out.printf(" Manager: your vehicle %s is fixed.\n", vehicle);
    }

    @Override
    public void onPartFixed(Part part) {
        System.out.printf(" Manager: The part %s is fixed!\n", part.sparePartsName);
    }
}
