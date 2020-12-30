/**
 * This file is a part of GarageTest project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class Garage {
    public static void main(String[] args) {
        final int partCount = 8;
        Part[] carParts = new Part[partCount];
        carParts[0] = new Part("Exhaust", false);
        carParts[1] = new Part("Fuel supply system", false);
        carParts[2] = new Part("Starting system", false);
        carParts[3] = new Part("Rear camera", false);

        carParts[4] = new Part("Front seats", true);
        carParts[5] = new Part("Engine", true);
        carParts[6] = new Part("A/C", true);
        carParts[7] = new Part("Radio", true);

        Vehicle damagedVehicle = new Vehicle("Mazda_3", carParts);

        GarageManager manager = new GarageManager();

        manager.handleVehicle(damagedVehicle);
    }
}

