package Transport;

import java.util.List;
import java.util.Objects;

public abstract class Transport implements Competitive {
    private final String brand;
    private final String model;
    private double engineVolume;
    List<Mechanic> mechanic;
    List<Transport> transports;
    List<Driver> drivers;

    public Transport(String brand, String model, double engineVolume) {
        if (brand.isEmpty() || brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model.isEmpty() || model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public abstract void printType();

    @Override
    public String toString() {
        return "Бренд: " + getBrand() + ", Модель: " + getModel() + ", Объём двигателя: " + getEngineVolume();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void pitStop();

    public abstract void getBestLapTime();

    public abstract void getMaximumSpeed();

    public abstract void addMechanic(List<Mechanic> mechanic);
}

