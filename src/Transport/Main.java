package Transport;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Лада Калина", "", 1.5);
        Car car2 = new Car("Audi A8", "50 L TDI quattro", 3);
        Car car3 = new Car("BMW", "Z8", 3);
        Car car4 = new Car("Kia", "Sportage", 2.4);
        Bus bus1 = new Bus("ЛиАЗ", "21", 5);
        Bus bus2 = new Bus("Мерседес", "233", 5);
        Bus bus3 = new Bus("ПАЗ", "258", 5);
        Bus bus4 = new Bus("КАВЗ", "77", 5);
        Truck truck1 = new Truck("КамАЗ", "33", 6);
        Truck truck2 = new Truck("JAC", "22", 7);
        Truck truck3 = new Truck("Komatsu", "355", 6);
        Truck truck4 = new Truck("Scania", "66", 7);
        DriverCategoryB<Car> driver1 = new DriverCategoryB<Car>("Иванов И.И.", true, 10);
        DriverCategoryC<Truck> driver2 = new DriverCategoryC<Truck>("Петров П.П.", true, 15);
        DriverCategoryD<Bus> driver3 = new DriverCategoryD<Bus>("Сидоров С.С.", true, 5);
        driver1.driveVehicle(car1);
        driver2.driveVehicle(truck2);
        driver3.driveVehicle(bus2);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);
        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);
        System.out.println(truck4);
        System.out.println(driver1);
        System.out.println(driver2);
        System.out.println(driver3);
    }
}
