import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//100/100
public class Task6_VehicleCatalogue {
    static class Vehicle {
        String type;
        String model;
        String color;
        int horsePower;

        public Vehicle(String type, String model, String color, int horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public String toString() {
            return String.format("Type: %s%n" +
                            "Model: %s%n" +
                            "Color: %s%n" +
                            "Horsepower: %d%n", getType().toUpperCase().charAt(0) + getType().substring(1)
                    , getModel(), getColor(), getHorsePower());
        }
    }

    public static double averageHorsePower(List<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            return 0.0;
        }
        return vehicles.stream().mapToDouble(Vehicle::getHorsePower)
                .sum() / vehicles.size();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();


        List<Vehicle> allVehicles = new ArrayList<>();
        while (!line.equals("End")) {

            String[] data = line.split(" ");
            Vehicle vehicle = new Vehicle(data[0], data[1], data[2], Integer.parseInt(data[3]));
            allVehicles.add(vehicle);

            line = scanner.nextLine();
        }

        line = scanner.nextLine();

        while (!line.equals("Close the Catalogue")) {
            String model = line;

            allVehicles.stream()
                    .filter(vehicle -> vehicle.getModel().equals(model))
                    .forEach(vehicle -> System.out.print(vehicle.toString()));

            line = scanner.nextLine();
        }

        List<Vehicle> car = allVehicles.stream()
                .filter(vehicle -> vehicle
                        .getType().equals("car"))
                .collect(Collectors.toList());

        List<Vehicle> truck = allVehicles.stream()
                .filter(vehicle -> vehicle
                        .getType().equals("truck"))
                .collect(Collectors.toList());


        System.out.printf("Cars have average horsepower of: %.2f.%n",averageHorsePower(car));
        System.out.printf("Trucks have average horsepower of: %.2f.",averageHorsePower(truck));

    }
}


