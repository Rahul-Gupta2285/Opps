public class Constructor {

    public static void main(String[] args) {
        // Creating an instance (object) of the Car class using the constructor
        Car myCar = new Car("Toyota", "Camry", 2023);

        // Accessing the attributes and methods of the object
        System.out.println("My car is a " + myCar.year + " " + myCar.make + " " + myCar.model);
        System.out.println("Current speed: " + myCar.getSpeed());

        // Accelerating the car
        myCar.accelerate();
        System.out.println("Accelerating... Current speed: " + myCar.getSpeed());

        // Applying the brakes
        myCar.brake();
        System.out.println("Braking... Current speed: " + myCar.getSpeed());
    }
}

class Car {
    // Instance variables (attributes)
    String make;
    String model;
    int year;
    int speed;

    // Constructor for the Car class ==>> parameterized contructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    // Method to accelerate the car
    public void accelerate() {
        speed += 10;
    }

    // Method to apply the brakes
    public void brake() {
        speed -= 10;
    }

    // Method to get the current speed of the car
    public int getSpeed() {
        return speed;
    }
}