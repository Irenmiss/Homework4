package Transport;

public class Car extends Transport implements Competitive {
    public Car() {
        super("", "", 0);
    }

    public Car(String brand, String model, double engineVolume) {
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

}
