package demo;

class Vehicle {
    void startEngine() {
        System.out.println("Starting the engine of a generic vehicle.");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Starting the engine of a car. Ignition initiated.");
    }

    void drift() {
        System.out.println("Performing a drift in the car!");
    }
}

public class ExtensionFunction {
	public static void main(String[] args) {
		Car car = new Car();
        car.startEngine();
        car.drift();
	}
}
