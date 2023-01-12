package Transport;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Лада Калина", "", 1.5, Car.BodyType.BODY_TYPE_HATCHBACK);
        Car car2 = new Car("Audi A8", "50 L TDI quattro", 3, Car.BodyType.BODY_TYPE_SEDAN);
        Car car3 = new Car("BMW", "Z8", 3, Car.BodyType.BODY_TYPE_CROSSOVER);
        Car car4 = new Car("Kia", "Sportage", 2.4, Car.BodyType.BODY_TYPE_SEDAN);
        Bus bus1 = new Bus("ЛиАЗ", "21", 5, Bus.NumberOfSeats.SMALL);
        Bus bus2 = new Bus("Мерседес", "233", 5, Bus.NumberOfSeats.SUPER_SMALL);
        Bus bus3 = new Bus("ПАЗ", "258", 5, Bus.NumberOfSeats.LARGE);
        Bus bus4 = new Bus("КАВЗ", "77", 5, Bus.NumberOfSeats.MEDIUM);
        Truck truck1 = new Truck("КамАЗ", "33", 6, Truck.LoadCapacity.N1);
        Truck truck2 = new Truck("JAC", "22", 7, Truck.LoadCapacity.N3);
        Truck truck3 = new Truck("Komatsu", "355", 6, Truck.LoadCapacity.N2);
        Truck truck4 = new Truck("Scania", "66", 7, Truck.LoadCapacity.N1);
        List<Transport> transportList = new ArrayList<>();
        transportList.add(car1);
        transportList.add(car2);
        transportList.add(car3);
        transportList.add(car4);
        transportList.add(bus1);
        transportList.add(bus2);
        transportList.add(bus3);
        transportList.add(bus4);
        transportList.add(truck1);
        transportList.add(truck2);
        transportList.add(truck3);
        transportList.add(truck4);
        transportList.forEach(System.out::println);

        DriverCategoryB<Car> driver1 = new DriverCategoryB<Car>("Иванов И.И.", true, 10);
        DriverCategoryC<Truck> driver2 = new DriverCategoryC<Truck>("Петров П.П.", true, 15);
        DriverCategoryD<Bus> driver3 = new DriverCategoryD<Bus>("Сидоров С.С.", true, 5);
        List<Driver> driversList = new ArrayList<>();
        driversList.add(driver1);
        driversList.add(driver2);
        driversList.add(driver3);
        driversList.forEach(System.out::println);

        driver1.driveVehicle(car1);
        driver2.driveVehicle(truck2);
        driver3.driveVehicle(bus2);

        Mechanic mechanic1 = new Mechanic("Винтик В.В.", "Авто-Сервис", Mechanic.MechanicSpecializations.SPECIALIZATION_CAR);
        Mechanic mechanic2 = new Mechanic("Шпунтик Ш.Ш.", "Авто-Сервис", Mechanic.MechanicSpecializations.SPECIALIZATION_BUS);
        Mechanic mechanic3 = new Mechanic("Ломастер Н.Н", "Супер-Ремонт", Mechanic.MechanicSpecializations.SPECIALIZATION_TRUCK);
        Mechanic mechanic4 = new Mechanic("Всеумейкин К.К.", "Техпомощь", Mechanic.MechanicSpecializations.SPECIALIZATION_UNIVERSAL);
        List<Mechanic> mechanicList = new ArrayList<>();
        mechanicList.add(mechanic1);
        mechanicList.add(mechanic2);
        mechanicList.add(mechanic3);
        mechanicList.add(mechanic4);
        mechanicList.forEach(System.out::println);

        car1.addMechanic(mechanicList);
        bus3.addMechanic(mechanicList);
        truck2.addMechanic(mechanicList);
        car4.addMechanic(mechanicList);
    }
}
