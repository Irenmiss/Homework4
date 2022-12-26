package Transport;

public class DriverCategoryC<T extends Transport & Competitive> extends Driver {
    public DriverCategoryC() {
        super("", true, 0);
    }

    public DriverCategoryC(String fullName, boolean driversLicence, int drivingExperience) {
        super(fullName, driversLicence, drivingExperience);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void driveVehicle(T transport) {
        System.out.println("Водитель " + getDriverFullName() + " управляет грузовым автомобилем " + transport.getBrand() + " " +
                transport.getModel() + " и будет участвовать в заезде.");
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории C начинает движение.");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель категории C останавливается.");
    }

    @Override
    public void stopForRefuel() {
        System.out.println("Водитель категории С останавливается для дозаправки.");
    }
}
