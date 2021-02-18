package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] data;
        List<Vehicle> cars = new ArrayList<>();
        List<Vehicle> trucks = new ArrayList<>();
        double averageCarsHorsepower = 0.0, averageTrucksHorsepower = 0.0;

        String expression = input.nextLine();

        while(true){
            if(expression.equals("End")){
                break;
            }

            data = expression.split("\\s+");

            Vehicle vehicle = new Vehicle(data[0], data[1], data[2], Integer.parseInt(data[3]));

            if(vehicle.getType().equals("Car")){
                cars.add(vehicle);
            }
            else{
                trucks.add(vehicle);
            }

            expression = input.nextLine();
        }

        String modelOfVehicle = input.nextLine();

        while(true){
            if(modelOfVehicle.equals("Close the Catalogue")){
                break;
            }

            for (int a = 0; a < cars.size(); a++) {
                if(cars.get(a).getModel().equals(modelOfVehicle)){
                    System.out.println(cars.get(a).toString());
                }
            }

            for (int b = 0; b < trucks.size(); b++) {
                if(trucks.get(b).getModel().equals(modelOfVehicle)){
                    System.out.println(trucks.get(b).toString());
                }
            }

            modelOfVehicle = input.nextLine();
        }

        for (int c = 0; c < cars.size(); c++){
            averageCarsHorsepower += cars.get(c).getHorsepower();
        }

        for (int d = 0; d < trucks.size(); d++){
            averageTrucksHorsepower += trucks.get(d).getHorsepower();
        }

        if(cars.size() != 0){
            System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarsHorsepower / (double)cars.size());
        }
        else{
            System.out.println("Cars have average horsepower of: 0.00.");
        }

        if(trucks.size() != 0){
            System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTrucksHorsepower / (double)trucks.size());
        }
        else{
            System.out.println("Trucks have average horsepower of: 0.00.");
        }

    }


}

class Vehicle{
    private String type;
    private String model;
    private String colour;
    private int horsepower;

    public Vehicle(String type, String model, String colour, int horsepower){
        this.setType(type);
        this.model = model;
        this.colour = colour;
        this.horsepower = horsepower;
    }

    private void setType(String type){
        type = type.replace(type.charAt(0), Character.toUpperCase(type.charAt(0)));
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public String getModel(){
        return this.model;
    }

    public String getColour(){
        return this.colour;
    }

    public int getHorsepower(){
        return this.horsepower;
    }

    @Override
    public String toString(){
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d", this.getType(), this.getModel(), this.getColour(), this.getHorsepower());
    }
}
