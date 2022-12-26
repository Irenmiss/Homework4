package Transport;

public class DriverCategoryB<T extends Transport & Competitive> extends Driver {
    public DriverCategoryB() {
        super("", true, 0);
    }

    public DriverCategoryB(String driverFullName, boolean driversLicence, int drivingExperience) {
        super(driverFullName, driversLicence, drivingExperience);
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
        System.out.println("Водитель " + getDriverFullName() + " управляет легковым автомобилем " + transport.getBrand() + " " +
                transport.getModel() + " и будет участвовать в заезде.");
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории B начинает движение.");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель категории B останавливается.");
    }

    @Override
    public void stopForRefuel() {
        System.out.println("Водитель категории B останавливается для дозаправки.");
    }

}
