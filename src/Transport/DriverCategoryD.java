package Transport;

public class DriverCategoryD<T extends Transport & Competitive> extends Driver {
    public DriverCategoryD() {
        super("", true, 0);
    }

    public DriverCategoryD(String fullName, boolean driversLicence, int drivingExperience) {
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
        System.out.println("Водитель " + getDriverFullName() + " управляет автобусом " + transport.getBrand() + " " +
                transport.getModel() + " и будет участвовать в заезде.");
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории D начинает движение.");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель категории D останавливается.");
    }

    @Override
    public void stopForRefuel() {
        System.out.println("Водитель категории D останавливается для дозаправки.");
    }
}
