package Transport;

import java.util.ArrayList;
import java.util.List;

public class Car extends Transport {
    enum BodyType {
        BODY_TYPE_SEDAN("Седан"),
        BODY_TYPE_HATCHBACK("Хэтчбек"),
        BODY_TYPE_COUPE("Купе"),
        BODY_TYPE_STATION_WAGON("Универсал"),
        BODY_TYPE_JEEP("Внедорожник"),
        BODY_TYPE_CROSSOVER("Кроссовер"),
        BODY_TYPE_PICKUP("Пикап"),
        BODY_TYPE_VAN("Фургон"),
        BODY_TYPE_MINIVAN("Минивэн");

        private final String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public String getBodyType() {
            return bodyType;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + bodyType;
        }
    }

    private BodyType bodyType;
    private final ArrayList<Mechanic> mechanics = new ArrayList<>();

    public Car() {
        super("", "", 0);
    }

    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
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
        System.out.println("Автомобиль начинает движение.");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автомобиль останавливается.");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп для автомобилей.");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Лучшее время круга среди автомобилей: ");
    }

    @Override
    public void getMaximumSpeed() {
        System.out.println("Максимальная скорость среди автомобилей: ");
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно.");
        } else {
            System.out.println(bodyType);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", " + bodyType.toString();
    }

    @Override
    public void defineMechanicForTransport(Mechanic mechanic) {
        if (mechanic.getMechanicSpecialization() == Mechanic.MechanicSpecializations.SPECIALIZATION_CAR || mechanic.getMechanicSpecialization() == Mechanic.MechanicSpecializations.SPECIALIZATION_UNIVERSAL) {
            System.out.println("Для ТО и ремонта " + getBrand() + " " + getModel() + " назначен механик " + mechanic.getMechanicFullName());
        } else {
            System.out.println("Выбранный механик не может работать с данным типом транспорта.");
        }
    }
}
