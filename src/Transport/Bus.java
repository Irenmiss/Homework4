package Transport;

public class Bus extends Transport implements Competitive {
    public Bus() {
        super("", "", 0);
    }

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
}
