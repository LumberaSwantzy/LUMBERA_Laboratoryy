import java.util.*;
class Vehicle {
    private String brand;
    private int speed;
    private String fuelType;

    //Constructor
    public Vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    //Encapsulating
    public String getBrand() {
        return brand;
    }
    public int getSpeed() {
        return speed;
    }
    public String getFuelType() {
        return fuelType;
    }

    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + "km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

//subclass car
class Car extends Vehicle{
    private int numDoors;

    public Car(String brand, int speed, String fuelType, int numDoors){
        super(brand, speed, fuelType);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}

class Motorcycle extends Vehicle{
    private boolean hasSidecar;

    public Motorcycle(String brand, int speed, String fuelType, boolean hasSidecar){
        super(brand, speed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

public class TestVehicle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //car
        System.out.println("Enter Car Details: ");
        System.out.println("Brand: ");
        String carBrand = scanner.nextLine();
        System.out.println("Speed: ");
        int carSpeed = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Fuel Type: ");
        String carFuel = scanner.nextLine();
        System.out.println("Number of Doors: ");
        int numDoors = scanner.nextInt();
        scanner.nextLine();

        //motorcycle
        System.out.println("Enter Motorcycle Details: ");
        System.out.println("Brand: ");
        String motorcycleBrand = scanner.nextLine();
        System.out.println("Speed: ");
        int motorcycleSpeed = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Fuel Type: ");
        String motorcycleFuel = scanner.nextLine();
        System.out.println("Has Sidecar? (true/false): ");
        boolean hasSidecar = scanner.nextBoolean();

        Vehicle car =  new Car (carBrand, carSpeed, carFuel, numDoors);
        Vehicle motorcycle = new Motorcycle (motorcycleBrand, motorcycleSpeed, motorcycleFuel, hasSidecar);

        System.out.println("\nCar Details: ");
        car.displayInfo();
        System.out.println();
        System.out.println("\nMotorcycle Details: ");
        motorcycle.displayInfo();

        scanner.close();
    }
}

