package Transport;

public class Truck extends Transport implements Competitive {
    public Truck() {
        super("", "", 0);
    }

    public Truck(String brand, String model, double engineVolume) {
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
}
