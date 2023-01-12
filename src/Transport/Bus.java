package Transport;

import java.util.List;

public class Bus extends Transport {
    enum NumberOfSeats {
        SUPER_SMALL(0, 10),
        SMALL(0, 25),
        MEDIUM(40, 50),
        LARGE(60, 80),
        SUPER_LARGE(100, 120);
        private final int minimumNumberOfSeats;
        private final int maximumNumberOfSeats;

        NumberOfSeats(Integer minimumNumberOfSeats, Integer maximumNumberOfSeats) {
            this.minimumNumberOfSeats = minimumNumberOfSeats;
            this.maximumNumberOfSeats = maximumNumberOfSeats;
        }

        public Integer getMinimumNumberOfSeats() {
            return minimumNumberOfSeats;
        }

        public Integer getMaximumNumberOfSeats() {
            return maximumNumberOfSeats;
        }
        public String toString() {
            if (minimumNumberOfSeats == 0) {
                return "Вместимость: до " + maximumNumberOfSeats + " мест.";
            }
            if (maximumNumberOfSeats == 0) {
                return "Вместимость: более " + minimumNumberOfSeats + " мест.";
            }
            return "Вместимость: " + minimumNumberOfSeats + "-" + maximumNumberOfSeats + " мест.";
        }

    }
    private NumberOfSeats numberOfSeats;
    public Bus() {
        super("", "", 0);
    }

    public Bus(String brand, String model, double engineVolume, NumberOfSeats numberOfSeats) {
        super(brand, model, engineVolume);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + numberOfSeats.toString();
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
        System.out.println("Автобус начинает движение.");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус останавливается.");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп, автобусы.");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Лучшее время круга среди автобусов: ");
    }

    @Override
    public void getMaximumSpeed() {
        System.out.println("Максимальная скорость среди автобусов: ");
    }

    @Override
    public void printType() {
        if (numberOfSeats == null) {
            System.out.println("Данных по транспортному средству недостаточно.");
        } else {
            System.out.println("Вместимость: " + numberOfSeats.getMinimumNumberOfSeats() + "-" + numberOfSeats.getMaximumNumberOfSeats() + " мест.");
        }
    }

    @Override
    public void addMechanic(List<Mechanic> mechanic) {
        for (Mechanic value : mechanic) {
            if (value.getMechanicSpecialization() == Mechanic.MechanicSpecializations.SPECIALIZATION_BUS || value.getMechanicSpecialization() == Mechanic.MechanicSpecializations.SPECIALIZATION_UNIVERSAL) {
                System.out.println("Для ТО и ремонта " + getBrand() + getModel() + " назначен механик " + value.getMechanicFullName());
            }
        }
    }
}
