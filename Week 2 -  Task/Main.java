class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("Engine started for " + make + " " + model);
    }
}

class ElectricCar extends Car {
    private int batteryRange;

    public ElectricCar(String make, String model, int year, int batteryRange) {
        super(make, model, year);
        this.batteryRange = batteryRange;
    }

    public void chargeBattery() {
        System.out.println("Battery is being charged.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car[] cars = { new Car("Toyota", "Camry", 2022), new ElectricCar("Tesla", "Model 3", 2023, 350) };
        for (Car car : cars) {
            car.startEngine();
        }
    }
}

