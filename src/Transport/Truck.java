package Transport;

import java.util.List;

public class Truck extends Transport {
    enum LoadCapacity {
        N1(0f, 3.5f),
        N2(3.5f, 12f),
        N3(12.1f, 0);
        private final float minimumTonnage;
        private final float maximumTonnage;
        LoadCapacity(float minimumTonnage, float maximumTonnage) {
            this.minimumTonnage = minimumTonnage;
            this.maximumTonnage = maximumTonnage;
        }
        public String toString() {
            if (minimumTonnage == 0) {
                return "Грузоподъемность: до " + maximumTonnage + " тонн.";
            }
            if (maximumTonnage == 0) {
                return "Грузоподъемность: свыше " + minimumTonnage + " тонн.";
            }
            return "Грузоподъемность: от " + minimumTonnage + " до " + maximumTonnage + " тонн.";
        }

        public Float getMinimumTonnage() {
            return minimumTonnage;
        }

        public Float getMaximumTonnage() {
            return maximumTonnage;
        }
    }
    private LoadCapacity loadCapacity;
    public Truck() {
        super("", "", 0);
    }

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + loadCapacity.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик начинает движение.");
    }

    @Override
    public void stopMoving() {
        System.out.println("Грузовик останавливается.");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп среди грузовиков.");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Лучшее время круга среди грузовиков: ");
    }

    @Override
    public void getMaximumSpeed() {
        System.out.println("Максимальная скорость среди грузовиков: ");
    }
    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно.");
        }
        if (loadCapacity.getMinimumTonnage() == 0) {
            System.out.println("Грузоподъемность: до " + loadCapacity.getMaximumTonnage() + " тонн.");
        }
        if (loadCapacity.getMaximumTonnage() == 0) {
            System.out.println("Грузоподъемность: свыше " + loadCapacity.getMinimumTonnage() + " тонн.");
        } else {
            System.out.println("Грузоподъемность: от " + loadCapacity.getMinimumTonnage() + " до " + loadCapacity.getMaximumTonnage() + " тонн.");
        }
    }

    @Override
    public void defineMechanicForTransport(Mechanic mechanic) {
        if (mechanic.getMechanicSpecialization() == Mechanic.MechanicSpecializations.SPECIALIZATION_TRUCK || mechanic.getMechanicSpecialization() == Mechanic.MechanicSpecializations.SPECIALIZATION_UNIVERSAL) {
                System.out.println("Для ТО и ремонта " + getBrand() + " " + getModel() + " назначен механик " + mechanic.getMechanicFullName());
        }
    }
}

